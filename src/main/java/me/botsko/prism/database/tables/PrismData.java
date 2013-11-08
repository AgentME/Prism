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
public class PrismData extends org.jooq.impl.TableImpl<me.botsko.prism.database.tables.records.PrismDataRecord> {

	private static final long serialVersionUID = 971806799;

	/**
	 * The singleton instance of <code>minecraft.prism_data</code>
	 */
	public static final me.botsko.prism.database.tables.PrismData PRISM_DATA = new me.botsko.prism.database.tables.PrismData();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<me.botsko.prism.database.tables.records.PrismDataRecord> getRecordType() {
		return me.botsko.prism.database.tables.records.PrismDataRecord.class;
	}

	/**
	 * The column <code>minecraft.prism_data.id</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismDataRecord, org.jooq.types.UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this);

	/**
	 * The column <code>minecraft.prism_data.epoch</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismDataRecord, org.jooq.types.UInteger> EPOCH = createField("epoch", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this);

	/**
	 * The column <code>minecraft.prism_data.action_id</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismDataRecord, org.jooq.types.UInteger> ACTION_ID = createField("action_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this);

	/**
	 * The column <code>minecraft.prism_data.player_id</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismDataRecord, org.jooq.types.UInteger> PLAYER_ID = createField("player_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this);

	/**
	 * The column <code>minecraft.prism_data.world_id</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismDataRecord, org.jooq.types.UInteger> WORLD_ID = createField("world_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this);

	/**
	 * The column <code>minecraft.prism_data.x</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismDataRecord, java.lang.Integer> X = createField("x", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>minecraft.prism_data.y</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismDataRecord, java.lang.Integer> Y = createField("y", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>minecraft.prism_data.z</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismDataRecord, java.lang.Integer> Z = createField("z", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>minecraft.prism_data.block_id</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismDataRecord, java.lang.Integer> BLOCK_ID = createField("block_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>minecraft.prism_data.block_subid</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismDataRecord, java.lang.Integer> BLOCK_SUBID = createField("block_subid", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>minecraft.prism_data.old_block_id</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismDataRecord, java.lang.Integer> OLD_BLOCK_ID = createField("old_block_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>minecraft.prism_data.old_block_subid</code>. 
	 */
	public final org.jooq.TableField<me.botsko.prism.database.tables.records.PrismDataRecord, java.lang.Integer> OLD_BLOCK_SUBID = createField("old_block_subid", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>minecraft.prism_data</code> table reference
	 */
	public PrismData() {
		super("prism_data", me.botsko.prism.database.Minecraft.MINECRAFT);
	}

	/**
	 * Create an aliased <code>minecraft.prism_data</code> table reference
	 */
	public PrismData(java.lang.String alias) {
		super(alias, me.botsko.prism.database.Minecraft.MINECRAFT, me.botsko.prism.database.tables.PrismData.PRISM_DATA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<me.botsko.prism.database.tables.records.PrismDataRecord, org.jooq.types.UInteger> getIdentity() {
		return me.botsko.prism.database.Keys.IDENTITY_PRISM_DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<me.botsko.prism.database.tables.records.PrismDataRecord> getPrimaryKey() {
		return me.botsko.prism.database.Keys.KEY_PRISM_DATA_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<me.botsko.prism.database.tables.records.PrismDataRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<me.botsko.prism.database.tables.records.PrismDataRecord>>asList(me.botsko.prism.database.Keys.KEY_PRISM_DATA_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public me.botsko.prism.database.tables.PrismData as(java.lang.String alias) {
		return new me.botsko.prism.database.tables.PrismData(alias);
	}
}
