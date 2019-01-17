/* DO NOT EDIT THIS FILE
 *
 * Copyright (c) 2005 Borland Software Corporation. All Rights Reserved.
 *
 */

package com.borland.dx.dataset;

public class ResIndex {
  public static final int InvalidStoreName                         = 0;
  public static final int RefreshRowNotSupported                   = 1;
  public static final int ParameterCountMismatch                   = 2;
  public static final int NullColumnName                           = 3;
  public static final int DuplicateColumnName                      = 4;
  public static final int RestructureInProgress                    = 5;
  public static final int InvalidDataFileFormat                    = 6;
  public static final int DeleteNotAllowed                         = 7;
  public static final int ForeignKeyPrimaryMissing                 = 8;
  public static final int ReadOnlyColumn                           = 9;
  public static final int InvalidSchemaFile                        = 10;
  public static final int Commit                                   = 11;
  public static final int InvalidFormatException                   = 12;
  public static final int CannotUpdateScopedDataRow                = 13;
  public static final int NoNonBlobColumns                         = 14;
  public static final int InvalidColumnValue                       = 15;
  public static final int ColumnTypeConflict                       = 16;
  public static final int ColumnNotInRow                           = 17;
  public static final int CannotOrphanDetails                      = 18;
  public static final int InvalidIteratorUse                       = 19;
  public static final int UpdateNotAllowed                         = 20;
  public static final int Prepare                                  = 21;
  public static final int InvalidPrecision                         = 22;
  public static final int InvalidCharacters                        = 23;
  public static final int ReadOnlyStore                            = 24;
  public static final int QueryFailed                              = 25;
  public static final int NoDatabaseOnResolver                     = 26;
  public static final int InsufficientRowId                        = 27;
  public static final int NotSelectQuery                           = 28;
  public static final int NeedQueryProvider                        = 29;
  public static final int OnePassInputStream                       = 30;
  public static final int InvalidColumnPosition                    = 31;
  public static final int SortIndex                                = 32;
  public static final int UrlNotFoundInDesign                      = 33;
  public static final int ConnectionDescriptorNotSet               = 34;
  public static final int RowsLoaded                               = 35;
  public static final int PressEnterToSearch                       = 36;
  public static final int CantFindTableName                        = 37;
  public static final int EmptyColumnNames                         = 38;
  public static final int RowEdited                                = 39;
  public static final int NoSortAsInserted                         = 40;
  public static final int ColumnAlreadyBound                       = 41;
  public static final int InvalidFormat                            = 42;
  public static final int ConnectionNotClosed                      = 43;
  public static final int DataFileLoadFailed                       = 44;
  public static final int ProcedureFailed                          = 45;
  public static final int DataSetOpen                              = 46;
  public static final int RowChangePosted                          = 47;
  public static final int UnexpectedTypeGet                        = 48;
  public static final int IncompatibleDataRow                      = 49;
  public static final int InvalidConstraintName                    = 50;
  public static final int MissingResolver                          = 51;
  public static final int NoWhereClause                            = 52;
  public static final int NoPrimaryKey                             = 53;
  public static final int MatchNotFound                            = 54;
  public static final int InvalidSort                              = 55;
  public static final int NeedProcedureProvider                    = 56;
  public static final int ViewManagerCloneError                    = 57;
  public static final int UnrecognizedDataType                     = 58;
  public static final int InvalidClass                             = 59;
  public static final int DataSetHasNoRows                         = 60;
  public static final int BadProcedureProperties                   = 61;
  public static final int InsertNotAllowed                         = 62;
  public static final int MissingMasterDataSet                     = 63;
  public static final int ForeignKeyColumnMismatch                 = 64;
  public static final int TooManyAutoInc                           = 65;
  public static final int DataSetCorrupt                           = 66;
  public static final int UnknownDetailName                        = 67;
  public static final int NeedsRecalc                              = 68;
  public static final int NotSortable                              = 69;
  public static final int ProviderOwned                            = 70;
  public static final int ConstraintNameUsed                       = 71;
  public static final int DuplicatePrimary                         = 72;
  public static final int LinkColumnsError                         = 73;
  public static final int InvalidSortAsInserted                    = 74;
  public static final int RowDeleted                               = 75;
  public static final int MultipleRowsAffected                     = 76;
  public static final int IOError                                  = 77;
  public static final int MatchFound                               = 78;
  public static final int NoRowsToDelete                           = 79;
  public static final int CannotChangeColumnDataType               = 80;
  public static final int FieldPostError                           = 81;
  public static final int UrlNotFound                              = 82;
  public static final int MasterDetailViewError                    = 83;
  public static final int ResolveInProgress                        = 84;
  public static final int UnexpectedType                           = 85;
  public static final int LocateNonString                          = 86;
  public static final int NoCalcFields                             = 87;
  public static final int CantImportNullDataSet                    = 88;
  public static final int TableMissing                             = 89;
  public static final int ResolveFailed                            = 90;
  public static final int RowCanceled                              = 91;
  public static final int ChainedException                         = 92;
  public static final int BadQueryProperties                       = 93;
  public static final int DataSetNotOpen                           = 94;
  public static final int InvalidDelete                            = 95;
  public static final int RowAdded                                 = 96;
  public static final int UnexpectedEndOfQuery                     = 97;
  public static final int NoColumns                                = 98;
  public static final int NonExistentRowId                         = 99;
  public static final int NeedLocateStartOption                    = 100;
  public static final int MissingRequiredValue                     = 101;
  public static final int InvalidRowValues                         = 102;
  public static final int LocateString                             = 103;
  public static final int SetCalculatedFailure                     = 104;
  public static final int InvalidVariantName                       = 105;
  public static final int NoRows                                   = 106;
  public static final int QueryInProcess                           = 107;
  public static final int DuplicateKey                             = 108;
  public static final int ReopenFailure                            = 109;
  public static final int ExceptionChain                           = 110;
  public static final int NoResultSet                              = 111;
  public static final int CannotRefresh                            = 112;
  public static final int ProviderFailed                           = 113;
  public static final int NoUpdatableColumns                       = 114;
  public static final int InvalidVariantType                       = 115;
  public static final int UnknownColumnName                        = 116;
  public static final int MismatchedParameterFormat                = 117;
  public static final int InvalidAggDescriptor                     = 118;
  public static final int WrongDatabase                            = 119;
  public static final int NoOriginalRow                            = 120;
  public static final int LoadingNotStarted                        = 121;
  public static final int TransactionIsolationLevelNotSupported    = 122;
  public static final int UnknownParamName                         = 123;
  public static final int CannotChangeColumn                       = 124;
  public static final int ErrorCode                                = 125;
  public static final int InvalidStoreClass                        = 126;
  public static final int CannotSaveChanges                        = 127;
  public static final int NotDatabaseResolver                      = 128;
  public static final int ForeignKeyViolationSql                   = 129;
  public static final int CannotDittoExisting                      = 130;
  public static final int ProcedureInProcess                       = 131;
  public static final int NotUpdatable                             = 132;
  public static final int LinkFieldInUserParameters                = 133;
  public static final int DriverNotLoadedAtRuntime                 = 134;
  public static final int ReadOnlyDataSet                          = 135;
  public static final int MismatchParamResult                      = 136;
  public static final int DeleteDuplicates                         = 137;
  public static final int LessThanMin                              = 138;
  public static final int DriverNotLoadedInDesign                  = 139;
  public static final int DataSetHasNoTable                        = 140;
  public static final int ConstraintMissing                        = 141;
  public static final int ForeignKeyViolation                      = 142;
  public static final int NoRowsAffected                           = 143;
  public static final int AlreadyLoading                           = 144;
  public static final int QueryNotExecuted                         = 145;
  public static final int MissingReplaceRow                        = 146;
  public static final int NeedStorageDataSet                       = 147;
  public static final int GreaterThanMax                           = 148;
  public static final int InvalidColumnType                        = 149;
  public static final int NoCalcAggFields                          = 150;
  public static final int PartialSearchForString                   = 151;
}
