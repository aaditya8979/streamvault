package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class FileObserverC4775f6 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Consumer f66727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f66728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4676ba f66729c;

    public FileObserverC4775f6(File file, C4827h6 c4827h6, C4676ba c4676ba) {
        super(file.getAbsolutePath(), 8);
        this.f66727a = c4827h6;
        this.f66728b = file;
        this.f66729c = c4676ba;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i10, String str) {
        if (i10 != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f66727a;
        C4676ba c4676ba = this.f66729c;
        File file = this.f66728b;
        c4676ba.getClass();
        consumer.consume(new File(file, str));
    }
}
