package com.yandex.div.storage.database;

import android.database.Cursor;
import bn.r;
import com.yandex.div.internal.util.IOUtils;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: ReadState.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ReadState implements Closeable {

    @Nullable
    private Cursor _cursor;

    @NotNull
    private final ym.a<Cursor> cursorProvider;

    @NotNull
    private final sn.a<r> onCloseState;

    public ReadState(@NotNull sn.a<r> aVar, @NotNull ym.a<Cursor> aVar2) {
        this.onCloseState = aVar;
        this.cursorProvider = aVar2;
    }

    public /* synthetic */ ReadState(sn.a aVar, ym.a aVar2, int i10, i iVar) {
        this((i10 & 1) != 0 ? new sn.a<r>() { // from class: com.yandex.div.storage.database.ReadState.1
            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        } : aVar, aVar2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IOUtils.closeCursorSilently(this._cursor);
        this.onCloseState.invoke();
    }

    @NotNull
    public final Cursor getCursor() {
        if (this._cursor != null) {
            throw new RuntimeException("Cursor should be called only once");
        }
        Cursor cursor = this.cursorProvider.get();
        this._cursor = cursor;
        return cursor;
    }
}
