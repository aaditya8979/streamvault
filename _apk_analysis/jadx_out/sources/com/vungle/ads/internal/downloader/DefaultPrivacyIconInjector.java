package com.vungle.ads.internal.downloader;

import android.util.Base64;
import androidx.annotation.WorkerThread;
import bn.r;
import com.ironsource.C3978d4;
import com.safedk.android.internal.partials.LiftoffMonetizeFilesBridge;
import com.vungle.ads.internal.Constants;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.c;
import on.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DefaultPrivacyIconInjector.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0002¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/downloader/DefaultPrivacyIconInjector;", "", "()V", "injectPrivacyIcon", "Ljava/io/File;", "dir", "writePrivacyFileFromString", "", C3978d4.i.f31327b, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DefaultPrivacyIconInjector {

    @NotNull
    public static final DefaultPrivacyIconInjector INSTANCE = new DefaultPrivacyIconInjector();

    private DefaultPrivacyIconInjector() {
    }

    private final boolean writePrivacyFileFromString(File file) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            byte[] bArrDecode = Base64.decode(Constants.LO_PRIVACY_ICON_STRING, 0);
            FileOutputStream fileOutputStreamFileOutputStreamCtor = LiftoffMonetizeFilesBridge.fileOutputStreamCtor(file);
            try {
                fileOutputStreamFileOutputStreamCtor.write(bArrDecode);
                r rVar = r.f5635a;
                b.a(fileOutputStreamFileOutputStreamCtor, null);
                objM7534constructorimpl = Result.m7534constructorimpl(Boolean.TRUE);
            } finally {
            }
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = bool;
        }
        return ((Boolean) objM7534constructorimpl).booleanValue();
    }

    @WorkerThread
    @Nullable
    public final File injectPrivacyIcon(@NotNull File dir) {
        p.k(dir, "dir");
        File file = new File(dir, Constants.PRIVACY_ICON_FILE_NAME);
        if (file.exists() || writePrivacyFileFromString(file)) {
            return file;
        }
        return null;
    }
}
