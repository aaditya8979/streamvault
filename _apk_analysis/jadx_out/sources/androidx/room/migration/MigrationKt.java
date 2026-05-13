package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: Migration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\t"}, d2 = {"", "startVersion", "endVersion", "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Lbn/r;", "migrate", "Landroidx/room/migration/Migration;", "Migration", "room-ktx_release"}, k = 2, mv = {1, 7, 1})
public final class MigrationKt {
    @NotNull
    public static final Migration Migration(int i10, int i11, @NotNull l<? super SupportSQLiteDatabase, r> lVar) {
        p.k(lVar, "migrate");
        return new MigrationImpl(i10, i11, lVar);
    }
}
