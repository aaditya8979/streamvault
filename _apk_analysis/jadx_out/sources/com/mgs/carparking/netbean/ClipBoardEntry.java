package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ClipBoardEntry.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class ClipBoardEntry {

    @Nullable
    private String channel_code;

    @Nullable
    private String invited_by;

    @Nullable
    public final String getChannel_code() {
        return this.channel_code;
    }

    @Nullable
    public final String getInvited_by() {
        return this.invited_by;
    }

    public final void setChannel_code(@Nullable String str) {
        this.channel_code = str;
    }

    public final void setInvited_by(@Nullable String str) {
        this.invited_by = str;
    }
}
