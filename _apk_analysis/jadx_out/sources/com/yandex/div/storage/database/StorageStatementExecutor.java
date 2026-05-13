package com.yandex.div.storage.database;

import android.database.SQLException;
import androidx.annotation.AnyThread;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.DivStorageErrorException;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StorageStatementExecutor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class StorageStatementExecutor {

    @NotNull
    private final sn.a<DatabaseOpenHelper.Database> dbProvider;

    /* JADX INFO: compiled from: StorageStatementExecutor.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivDataRepository.ActionOnError.values().length];
            try {
                iArr[DivDataRepository.ActionOnError.ABORT_TRANSACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivDataRepository.ActionOnError.SKIP_ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StorageStatementExecutor(@NotNull sn.a<? extends DatabaseOpenHelper.Database> aVar) {
        this.dbProvider = aVar;
    }

    private static final void execute$executeCatchingSqlException(Ref$ObjectRef<StorageStatement> ref$ObjectRef, Ref$IntRef ref$IntRef, StorageStatement[] storageStatementArr, DivDataRepository.ActionOnError actionOnError, StorageStatementExecutor storageStatementExecutor, List<DivStorageErrorException> list, ClosableSqlCompiler closableSqlCompiler, StorageStatement storageStatement) {
        try {
            storageStatement.execute(closableSqlCompiler);
        } catch (SQLException e10) {
            execute$handleException(ref$ObjectRef, ref$IntRef, storageStatementArr, actionOnError, storageStatementExecutor, list, e10);
        } catch (IllegalStateException e11) {
            execute$handleException(ref$ObjectRef, ref$IntRef, storageStatementArr, actionOnError, storageStatementExecutor, list, e11);
        }
    }

    private static final void execute$handleException(Ref$ObjectRef<StorageStatement> ref$ObjectRef, Ref$IntRef ref$IntRef, StorageStatement[] storageStatementArr, DivDataRepository.ActionOnError actionOnError, StorageStatementExecutor storageStatementExecutor, List<DivStorageErrorException> list, Exception exc) {
        String str = "Exception at statement '" + ref$ObjectRef.element + "' (" + ref$IntRef.element + " out " + storageStatementArr.length + ')';
        int i10 = WhenMappings.$EnumSwitchMapping$0[actionOnError.ordinal()];
        if (i10 == 1) {
            storageStatementExecutor.throwWithLogging(str, exc);
            throw new KotlinNothingValueException();
        }
        if (i10 != 2) {
            return;
        }
        list.add(new DivStorageErrorException(str, exc, null, 4, null));
    }

    private final Void throwWithLogging(String str, Exception exc) throws SQLException {
        throw new SQLException(str, exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061 A[PHI: r15
      0x0061: PHI (r15v4 com.yandex.div.storage.database.DatabaseOpenHelper$Database) = 
      (r15v3 com.yandex.div.storage.database.DatabaseOpenHelper$Database)
      (r15v5 com.yandex.div.storage.database.DatabaseOpenHelper$Database)
      (r15v7 com.yandex.div.storage.database.DatabaseOpenHelper$Database)
     binds: [B:40:0x00a7, B:49:0x00c6, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, com.yandex.div.storage.database.StorageStatement] */
    @androidx.annotation.AnyThread
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.yandex.div.storage.database.ExecutionResult execute(@org.jetbrains.annotations.NotNull com.yandex.div.storage.DivDataRepository.ActionOnError r21, @org.jetbrains.annotations.NotNull com.yandex.div.storage.database.StorageStatement... r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.storage.database.StorageStatementExecutor.execute(com.yandex.div.storage.DivDataRepository$ActionOnError, com.yandex.div.storage.database.StorageStatement[]):com.yandex.div.storage.database.ExecutionResult");
    }

    @AnyThread
    @NotNull
    public final ExecutionResult execute(@NotNull StorageStatement... storageStatementArr) throws SQLException {
        return execute(DivDataRepository.ActionOnError.ABORT_TRANSACTION, (StorageStatement[]) Arrays.copyOf(storageStatementArr, storageStatementArr.length));
    }
}
