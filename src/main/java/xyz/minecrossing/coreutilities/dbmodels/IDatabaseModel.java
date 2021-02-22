package xyz.minecrossing.coreutilities.dbmodels;

import java.util.List;

/**
 * A database model interface which provides useful contextual information
 *
 * @param <K> The key type of the entity
 */
public interface IDatabaseModel<K> {
	K getKey();
	List<String> getColumnNames();
}
