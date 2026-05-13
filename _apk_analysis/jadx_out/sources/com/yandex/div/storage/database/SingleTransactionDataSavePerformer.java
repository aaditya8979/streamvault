package com.yandex.div.storage.database;

import bn.r;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.rawjson.RawJson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: SingleTransactionDataSavePerformer.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class SingleTransactionDataSavePerformer {

    @NotNull
    private final StorageStatementExecutor storageStatementsExecutor;

    public SingleTransactionDataSavePerformer(@NotNull StorageStatementExecutor storageStatementExecutor) {
        this.storageStatementsExecutor = storageStatementExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StorageStatement createRawJsonsSaveStatement(List<? extends RawJson> list) {
        return StorageStatements.replaceRawJsons$default(StorageStatements.INSTANCE, list, null, 2, null);
    }

    private final ExecutionResult executeStatements(DivDataRepository.ActionOnError actionOnError, l<? super List<StorageStatement>, r> lVar) {
        ArrayList arrayList = new ArrayList();
        lVar.invoke(arrayList);
        StorageStatementExecutor storageStatementExecutor = this.storageStatementsExecutor;
        StorageStatement[] storageStatementArr = (StorageStatement[]) arrayList.toArray(new StorageStatement[0]);
        return storageStatementExecutor.execute(actionOnError, (StorageStatement[]) Arrays.copyOf(storageStatementArr, storageStatementArr.length));
    }

    @NotNull
    public final ExecutionResult saveRawJsons(@NotNull final List<? extends RawJson> list, @NotNull DivDataRepository.ActionOnError actionOnError) throws IOException {
        return executeStatements(actionOnError, new l<List<StorageStatement>, r>() { // from class: com.yandex.div.storage.database.SingleTransactionDataSavePerformer.saveRawJsons.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(List<StorageStatement> list2) {
                invoke2(list2);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<StorageStatement> list2) {
                list2.add(SingleTransactionDataSavePerformer.this.createRawJsonsSaveStatement(list));
            }
        });
    }
}
