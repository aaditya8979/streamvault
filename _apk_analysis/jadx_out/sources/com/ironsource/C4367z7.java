package com.ironsource;

import java.util.UUID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.z7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4367z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4367z7 f34502a = new C4367z7();

    private C4367z7() {
    }

    @NotNull
    public final UUID a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        tn.p.j(uuidRandomUUID, "randomUUID()");
        return uuidRandomUUID;
    }
}
