package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4647a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J6 f66343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f66344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f66345c;

    public C4647a7(J6 j62, ArrayList arrayList, boolean z10) {
        this.f66343a = j62;
        this.f66344b = arrayList;
        this.f66345c = z10;
    }

    public final String a(Context context, Y6 y62) {
        File parentFile;
        try {
            File fileA = this.f66343a.a(context, y62.b());
            if (!fileA.exists() && (parentFile = fileA.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                a(context, y62.a(), fileA);
            }
            return fileA.getPath();
        } catch (Throwable unused) {
            return y62.b();
        }
    }

    public final void a(Context context, String str, File file) {
        List list = this.f66344b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File fileA = ((J6) it.next()).a(context, str);
            if (fileA.exists()) {
                try {
                    if (this.f66345c) {
                        FileUtils.copyToNullable(fileA, file);
                    } else {
                        FileUtils.move(fileA, file);
                    }
                    String path = fileA.getPath();
                    String path2 = file.getPath();
                    for (String str2 : cn.w.p("-journal", "-shm", "-wal")) {
                        File file2 = new File(path + str2);
                        File file3 = new File(path2 + str2);
                        if (this.f66345c) {
                            FileUtils.copyToNullable(file2, file3);
                        } else {
                            FileUtils.move(file2, file3);
                        }
                    }
                    return;
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }
}
