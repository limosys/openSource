/* DO NOT EDIT THIS FILE
 *
 * Copyright (c) 2005 Borland Software Corporation. All Rights Reserved.
 *
 */

package com.borland.dx.dataset;
import com.borland.jb.util.*;

public class ResTable extends StringArrayResourceBundle {
  public ResTable() {
    strings = new String[] {
      "{0} is an invalid StoreName property for DataSet.  StoreName must not be null and must be 1 or more characters in length.",
      "Current DataSet does not support refetchRow.",
      "Parameter count mismatch.  Query has {0} parameter markers, but there are only {1} possible parameter columns passed.",
      "Column names cannot be set to null.",
      "Attempt to add a column with a duplicate column name",
      "Please wait.  A Restructure operation on {0} is in progress.",
      "Attempt load or save a DataSet with an invalid DataSet DataFileFormat property setting.",
      "Row deleting not allowed",
      "Could not add {0} foreign key constraint because there is no primary key for {1}",
      "Read only Columns cannot be updated",
      "Invalid schema file format.",
      "Commit",
      "Invalid format for {1} column at row {0}.",
      "Cannot modify Column elements in a Scoped DataRow",
      "Operation cannot be completed.  DataSet has no non-blob columns.",
      "Invalid Column value.",
      "Attempt to add a column with the same name, but different data type as an existing DataColumn.",
      " Column is in the DataSet, but was excluded from the row.",
      "Attempt to orphan detail rows from {0}.  Master rows that have detail rows linked to them cannot be deleted or have their linking columns modified when cascading deletes and/or updates are disabled",
      "Iterator operation not allowed on this row",
      "Row editing not allowed",
      "Prepare",
      "Values for the {0} column cannot be longer than {1} characters.",
      "Missing or invalid characters in field",
      "{0} Store property setting is readOnly.",
      "Execution of query failed.",
      "Cannot resolve data, since Database property is not set on Resolver.",
      "DataSet.refetchRow was called with an insufficient row id.",
      "Not a SELECT query, can't be parsed",
      "A QueryProvider is required.",
      "Column {0} was set to an input stream that could not be reset using InputStream.reset(). An attempt was made to read it multiple times.",
      "Column position is out of range.",
      "index",
      "The URL: {0} could not be found.  Check for misspellings, and that the right driver is present on the classpath.",
      "The Database Connection property has not been set",
      "{0} rows loaded",
      "Press Enter to begin search.",
      "Can't determine table name in the query property.",
      "List of columns is null or empty",
      "Editing row",
      "{0} index cannot be created with SORT_AS_INSERTED and UNIQUE sort options",
      "{0} column already bound to {1} DataSet.  Use (Column)Column.clone() to add this column.",
      "{0} column formatting error for default, min, max or values using column display format.",
      "Connection could not be closed.",
      "DataFile load failed.",
      "Execution of procedure failed.",
      "Operation cannot be performed on an open DataSet.  Close the DataSet first.",
      "Posted row",
      "Attempt to get a {1} value from a {0} value.",
      "Attempt to use a DataRow with a DataSet that it is out of sync with.",
      "{0} constraint cannot be dropped because {1} foreign key depends on it",
      "DataSet is missing a Resolver object.",
      "{0} DataSet is a detail that uses delayed detail fetching.  Query property must have a parametized where clause.",
      "Attempt to specify primary Sort without specifying any sortKey columns",
      "Could not find a matching column value.",
      "{0} index does not exist and no keys specified to create the index",
      "A ProcedureProvider is required.",
      "{0} Column ViewManager must implement the Cloneable interface.",
      "Unknown Variant data type:  ",
      "Can only assign {0} objects to this column",
      "Operation not allowed on an empty {0} DataSet.",
      "Missing or Bad procedure or database property settings.  Could not execute procedure.",
      "Row insertion not allowed",
      "Trying to resolve a detail DataSet without providing a master DataSet.",
      "Could not add {0} foreign key constraint because the number, type, precision or scale of reference columns do not match",
      "Only one AutoIncrement column is allowed.  {0} and {1} columns both have their AutoIncrement property set to true",
      "Prior structural change to {0} DataSet failed",
      "Unknown detail name: {0} ",
      "CalcFieldsListener or CalcAggFieldsListener missing for {0}",
      "Operation failed.  Attempt to sort on non-sortable column eg. a column of type INPUTSTREAM or OBJECT.",
      "The Provider is already owned by another DataSet.",
      "Could not add {0} constraint because a unique or foreign key constraint already exists with that name",
      "Attempt to specify different primary key when one already exists",
      "The number and data type of columns in the DataSet MasterLinkColumns and DetailLinkColumns must match",
      "Sort as inserted not supported with descending sort orders.",
      "Row deleted",
      "More than one row was affected by resolution query:",
      "Operation failed due to an IO error.",
      "Found matching column value.  Press up/down to find other matches.",
      "No rows to delete in dataSet:  {0}",
      "Cannot change Column Data Type because the column is already associated with a DataSet",
      "Cannot post the current row.  Data aware control failed to post a field value.",
      "The URL: {0} could not be found.  Check for misspellings, and that the right driver is present on the classpath.",
      "The SortDescriptor Keys property setting is not compatible with MasterDetail LinkColumns property",
      "DataSet changes are currently being saved.  Retry operation later.",
      "Attempt to set a {1} value to a {0} value.",
      "Enter a value and press enter to begin search.",
      "Operation failed.  There is a CalcFieldsListener, but no Columns with CalcType property set to CALC.",
      "Can't import into a DataSet that has no columns",
      "{0} table does not exist",
      "Failure during resolve of DataSet.",
      "Row editing canceled",
      "Chained exception:",
      "Missing or Bad query or database property settings.  Could not execute query",
      "Operation failed.  DataSet is not open.",
      "Row cannot be deleted.",
      "Row added",
      "Unexpected end of query, can't be parsed.",
      ":NoColumns",
      "DataSet.refetchRow was called with non existent row id.",
      "Must specify one of First, Last, Next, Prior LocateOptions for locate operations.",
      "Value for required column {0} not set",
      "Row cannot be posted due to invalid or missing field values.",
      "Enter a value.  Use mixed case characters for a case sensitive search.",
      "Invalid calcType or attempt to set calculated property for a column that already as data",
      "Invalid variant name: {0}",
      ":NoRows",
      "A query is already in process for this DataSet",
      "Duplicate key value for {1} sort order in {0}.",
      "Failure notifying dependent components of a DataSet reopen.",
      "Chain of 2 or more Exceptions occurred",
      "Execution of query did not return a result set.\r\nUse Database.executeQuery() for these queries.",
      "{0} DataSet need a Provider to support refresh.",
      "Execution of provider failed.",
      "Operation failed because there are no updatable columns or the column values are null.",
      "Invalid variant type: {0}",
      "Unknown column name: {0} ",
      "Cannot mix named parameters and '?' parameter markers",
      "Operation failed.  AggDescriptor has no groupColumns or some groupColumns do not exist in the DataSet",
      "The database property of the ProcedureDescriptors doesn't match the database we are resolving to.",
      "No previous original row found. When an updated row is loaded by StorageDataSet.loadRow(int status), the original row must be loaded immediately prior to the updated row.",
      "Cannot Load DataSet.  DataSet not in load mode",
      "Driver does not support this (or any higher) transaction isolation level.",
      "{0} is not recognized a parameter name.",
      "Use Column.clone() before applying changes.",
      "See {0} error code:  BASE+{1}",
      "Cannot open table with {0} class.  It must be opened with a {1} class",
      "{0} DataSet need a Resolver to support save changes.",
      "Trying to use Database to resolve a DataSet with a non-DatabaseResolver derived Resolver.",
      "Could not add {0} foreign key constraint because rows found using this query:  {1}",
      "Cannot ditto existing row.",
      "A procedure is already in process for this DataSet",
      "DataSet has no unique row identifiers. \r\nNote: For QueryDataSets you need to disable metaDataUpdate.ROWID in the MetaDataUpdate property, in addition to setting the RowId property on a column.",
      "A column in the DetailLinkColumns should not be included in the parameterRow. Column:  {0}",
      "The driver: {0} could not be loaded.  This could be a problem with the driver itself, or that the driver is not found on the classpath.",
      "DataSet is ReadOnly",
      "The output parameters of this procedure did not match the specification.",
      "Delete existing duplicates before creating a new unique sort.",
      "Value entered for {0} is less than the minimum allowed.  {1} is less than {2}.",
      "The driver: {0} could not be loaded.  This could be a problem with the driver itself, or that the driver is not found on the classpath.",
      "Cannot be saved.  Specify TableName property on DataSet.\r\nNote: For QueryDataSets you need to disable metaDataUpdate.TABLENAME in the MetaDataUpdate property, in addition to setting the Tablename property.",
      "{0} constraint does not exist",
      "{0} foreign key constraint was violated",
      "The row specified by the resolution query was not found.\r\nTypical reasons are:\r\n     Somebody deleted or changed this row.\r\n     A floating point comparison failed to match.\r\n     A CHAR field needs space padding (see Database.setUseSpacePadding).\r\nQuery:\r\n  ",
      "DataSet is already in the process of being loaded",
      "Query has not been executed yet",
      "Unexpected internal error: DataStore is missing a method replaceStoreRow.",
      "FetchAsNeeded cannot be set on MasterLinkDescriptor on a DataSetView.",
      "Value entered for {0} is greater than the maximum allowed.  {1} is greater than {2}.",
      "{0} is an invalid Column.DataType property setting for {1} Column.",
      "Operation failed.  There is a CalcAggFieldsListener, but no Columns with CalcType property set to AGGREGATE.",
      "Partial search option can only be used when last column searched on is of String type",
    };
  }
}
