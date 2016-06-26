/**
 * This class is generated by jOOQ
 */
package io.bootique.jooq.unit.generated;


import io.bootique.jooq.unit.generated.tables.TestTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class App extends SchemaImpl {

    private static final long serialVersionUID = 844408303;

    /**
     * The reference instance of <code>APP</code>
     */
    public static final App APP = new App();

    /**
     * The table <code>APP.test_table</code>.
     */
    public final TestTable TEST_TABLE = io.bootique.jooq.unit.generated.tables.TestTable.TEST_TABLE;

    /**
     * No further instances allowed
     */
    private App() {
        super("APP", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            TestTable.TEST_TABLE);
    }
}
