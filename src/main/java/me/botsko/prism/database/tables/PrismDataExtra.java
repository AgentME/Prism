/**
 * This class is generated by jOOQ
 */
package me.botsko.prism.database.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PrismDataExtra extends org.jooq.impl.TableImpl<me.botsko.prism.database.tables.records.PrismDataExtraRecord> {

	private static final long serialVersionUID = 1493291268;

	/**
	 * The singleton instance of <code>minecraft.prism_data_extra</code>
	 */
	public static final me.botsko.prism.database.tables.PrismDataExtra PRISM_DATA_EXTRA = new me.botsko.prism.database.tables.PrismDataExtra();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<me.botsko.prism.database.tables.records.PrismDataExtraRecord> getRecordType() {
		return me.botsko.prism.database.tables.records.PrismDataExtraRecord.class;
	}

	/**
	 * The column <code>minecraft.prism_data_extra.extra_id</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismDataExtraRecord, org.jooq.types.UInteger> EXTRA_ID = createField("extra_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this);

	/**
	 * The column <code>minecraft.prism_data_extra.data_id</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismDataExtraRecord, org.jooq.types.UInteger> DATA_ID = createField("data_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this);

	/**
	 * The column <code>minecraft.prism_data_extra.data</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismDataExtraRecord, java.lang.String> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * The column <code>minecraft.prism_data_extra.te_data</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismDataExtraRecord, java.lang.String> TE_DATA = createField("te_data", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * Create a <code>minecraft.prism_data_extra</code> table reference
	 */
	public PrismDataExtra() {
		super("prism_data_extra", me.botsko.prism.database.Minecraft.MINECRAFT);
	}

	/**
	 * Create an aliased <code>minecraft.prism_data_extra</code> table reference
	 */
	public PrismDataExtra(java.lang.String alias) {
		super(alias, me.botsko.prism.database.Minecraft.MINECRAFT, me.botsko.prism.database.tables.PrismDataExtra.PRISM_DATA_EXTRA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<me.botsko.prism.database.tables.records.PrismDataExtraRecord, org.jooq.types.UInteger> getIdentity() {
		return me.botsko.prism.database.Keys.IDENTITY_PRISM_DATA_EXTRA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<me.botsko.prism.database.tables.records.PrismDataExtraRecord> getPrimaryKey() {
		return me.botsko.prism.database.Keys.KEY_PRISM_DATA_EXTRA_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<me.botsko.prism.database.tables.records.PrismDataExtraRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<me.botsko.prism.database.tables.records.PrismDataExtraRecord>>asList(me.botsko.prism.database.Keys.KEY_PRISM_DATA_EXTRA_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public me.botsko.prism.database.tables.PrismDataExtra as(java.lang.String alias) {
		return new me.botsko.prism.database.tables.PrismDataExtra(alias);
	}
}
