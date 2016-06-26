/**
 * This class is generated by jOOQ
 */
package io.bootique.jooq.unit.generated.tables;


import io.bootique.jooq.unit.generated.App;
import io.bootique.jooq.unit.generated.Keys;
import io.bootique.jooq.unit.generated.tables.records.TestTableRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class TestTable extends TableImpl<TestTableRecord> {

    private static final long serialVersionUID = -1100416929;

    /**
     * The reference instance of <code>APP.test_table</code>
     */
    public static final TestTable TEST_TABLE = new TestTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestTableRecord> getRecordType() {
        return TestTableRecord.class;
    }

    /**
     * The column <code>APP.test_table.id</code>.
     */
    public final TableField<TestTableRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>APP.test_table.name</code>.
     */
    public final TableField<TestTableRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * Create a <code>APP.test_table</code> table reference
     */
    public TestTable() {
        this("test_table", null);
    }

    /**
     * Create an aliased <code>APP.test_table</code> table reference
     */
    public TestTable(String alias) {
        this(alias, TEST_TABLE);
    }

    private TestTable(String alias, Table<TestTableRecord> aliased) {
        this(alias, aliased, null);
    }

    private TestTable(String alias, Table<TestTableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return App.APP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TestTableRecord> getPrimaryKey() {
        return Keys.SQL160626161617430;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TestTableRecord>> getKeys() {
        return Arrays.<UniqueKey<TestTableRecord>>asList(Keys.SQL160626161617430);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestTable as(String alias) {
        return new TestTable(alias, this);
    }

    /**
     * Rename this table
     */
    public TestTable rename(String name) {
        return new TestTable(name, null);
    }
}
