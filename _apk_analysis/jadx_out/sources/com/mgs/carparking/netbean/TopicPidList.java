package com.mgs.carparking.netbean;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: TopicPidList.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TopicPidList implements Serializable {
    private boolean isSelector;
    public String name;
    private int pid;

    @NotNull
    public final String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        p.C("name");
        return null;
    }

    public final int getPid() {
        return this.pid;
    }

    public final boolean isSelector() {
        return this.isSelector;
    }

    public final void setName(@NotNull String str) {
        p.k(str, "<set-?>");
        this.name = str;
    }

    public final void setPid(int i10) {
        this.pid = i10;
    }

    public final void setSelector(boolean z10) {
        this.isSelector = z10;
    }
}
