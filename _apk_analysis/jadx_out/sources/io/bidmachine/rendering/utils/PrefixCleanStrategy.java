package io.bidmachine.rendering.utils;

import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class PrefixCleanStrategy extends CleanStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f70965a;

    public PrefixCleanStrategy(@NonNull String str) {
        this.f70965a = str;
    }

    @Override // io.bidmachine.rendering.utils.CleanStrategy
    public boolean a(File file) {
        return FileUtils.startWith(file, this.f70965a);
    }
}
