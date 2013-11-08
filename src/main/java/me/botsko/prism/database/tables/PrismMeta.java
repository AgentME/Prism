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
public class PrismMeta extends org.jooq.impl.TableImpl<me.botsko.prism.database.tables.records.PrismMetaRecord> {

	private static final long serialVersionUID = -221839293;

	/**
	 * The singleton instance of <code>minecraft.prism_meta</code>
	 */
	public static final me.botsko.prism.database.tables.PrismMeta PRISM_META = new me.botsko.prism.database.tables.PrismMeta();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<me.botsko.prism.database.tables.records.PrismMetaRecord> getRecordType() {
		return me.botsko.prism.database.tables.records.PrismMetaRecord.class;
	}

	/**
	 * The column <code>minecraft.prism_meta.id</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismMetaRecord, org.jooq.types.UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this);

	/**
	 * The column <code>minecraft.prism_meta.k</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismMetaRecord, java.lang.String> K = createField("k", org.jooq.impl.SQLDataType.VARCHAR.length(25).nullable(false), this);

	/**
	 * The column <code>minecraft.prism_meta.v</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismMetaRecord, java.lang.String> V = createField("v", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * Create a <code>minecraft.prism_meta</code> table reference
	 */
	public PrismMeta() {
		super("prism_meta", me.botsko.prism.database.Minecraft.MINECRAFT);
	}

	/**
	 * Create an aliased <code>minecraft.prism_meta</code> table reference
	 */
	public PrismMeta(java.lang.String alias) {
		super(alias, me.botsko.prism.database.Minecraft.MINECRAFT, me.botsko.prism.database.tables.PrismMeta.PRISM_META);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<me.botsko.prism.database.tables.records.PrismMetaRecord, org.jooq.types.UInteger> getIdentity() {
		return me.botsko.prism.database.Keys.IDENTITY_PRISM_META;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<me.botsko.prism.database.tables.records.PrismMetaRecord> getPrimaryKey() {
		return me.botsko.prism.database.Keys.KEY_PRISM_META_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<me.botsko.prism.database.tables.records.PrismMetaRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<me.botsko.prism.database.tables.records.PrismMetaRecord>>asList(me.botsko.prism.database.Keys.KEY_PRISM_META_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public me.botsko.prism.database.tables.PrismMeta as(java.lang.String alias) {
		return new me.botsko.prism.database.tables.PrismMeta(alias);
	}
}
