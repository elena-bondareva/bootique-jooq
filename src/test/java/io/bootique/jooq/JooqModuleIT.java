package io.bootique.jooq;

import com.nhl.bootique.BQRuntime;
import com.nhl.bootique.jdbc.JdbcModule;
import com.nhl.bootique.test.junit.BQTestFactory;
import io.bootique.jooq.unit.generated.Tables;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class JooqModuleIT {

    @Rule
    public BQTestFactory stack = new BQTestFactory();

    @Test
    public void testNewContext() {

        BQRuntime runtime = stack.newRuntime().configurator(bootique ->
                bootique.modules(JdbcModule.class, JooqModule.class)
        ).build("--config=classpath:test.yml").getRuntime();

        try (DSLContext c = runtime.getInstance(JooqFactory.class).newContext()) {

            c.createTable(Tables.TEST_TABLE).columns(Tables.TEST_TABLE.fields()).execute();

            c.delete(Tables.TEST_TABLE).execute();
            c.insertInto(Tables.TEST_TABLE).set(Tables.TEST_TABLE.ID, 4).set(Tables.TEST_TABLE.NAME, "me").execute();
            Record r = c.select().from(Tables.TEST_TABLE).fetchOne();
            assertNotNull(r);
            assertEquals(Integer.valueOf(4), r.get(Tables.TEST_TABLE.ID));
            assertEquals("me", r.get(Tables.TEST_TABLE.NAME));
        }
    }
}
