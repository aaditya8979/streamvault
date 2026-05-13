package com.unity3d.services.core.network.domain;

import com.ironsource.D8;
import java.io.File;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: CleanupDirectory.kt */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class CleanupDirectory$invoke$cachedFiles$1 extends FunctionReferenceImpl implements l<File, Boolean> {
    public static final CleanupDirectory$invoke$cachedFiles$1 INSTANCE = new CleanupDirectory$invoke$cachedFiles$1();

    public CleanupDirectory$invoke$cachedFiles$1() {
        super(1, File.class, D8.f29123d, "isFile()Z", 0);
    }

    @Override // sn.l
    @NotNull
    public final Boolean invoke(@NotNull File file) {
        p.k(file, "p0");
        return Boolean.valueOf(file.isFile());
    }
}
