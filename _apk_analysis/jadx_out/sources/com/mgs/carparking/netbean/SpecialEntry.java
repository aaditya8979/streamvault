package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SpecialEntry.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SpecialEntry {
    private boolean isHasNextPage;

    @Nullable
    private List<SpecialListEnntry> list;
    private int pageNum;
    private int total;

    @Nullable
    public final List<SpecialListEnntry> getList() {
        return this.list;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public final int getTotal() {
        return this.total;
    }

    public final boolean isHasNextPage() {
        return this.isHasNextPage;
    }

    public final void setHasNextPage(boolean z10) {
        this.isHasNextPage = z10;
    }

    public final void setList(@Nullable List<SpecialListEnntry> list) {
        this.list = list;
    }

    public final void setPageNum(int i10) {
        this.pageNum = i10;
    }

    public final void setTotal(int i10) {
        this.total = i10;
    }
}
