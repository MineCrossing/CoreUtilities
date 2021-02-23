package xyz.minecrossing.coreutilities.dbmodels;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A database model interface which provides useful contextual information
 *
 * @param <K> The key type of the entity
 */
public interface IDatabaseModel<K> {
	K getKey();

	default List<String> getColumnNames() {
		return Arrays.stream(this.getClass().getDeclaredFields()).filter(a -> a.getAnnotation(ColName.class) != null).map(c -> c.getAnnotation(ColName.class).col()).collect(Collectors.toList());
	}
}
