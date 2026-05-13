package com.vungle.ads.internal.session;

import android.content.Context;
import bn.r;
import cn.w;
import com.ironsource.C3978d4;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.FutureResult;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import sn.l;
import so.t;
import tn.p;
import xo.d;
import xo.u;

/* JADX INFO: compiled from: UnclosedAdDetector.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001,B'\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b*\u0010+J \u0010\u0005\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/vungle/ads/internal/session/UnclosedAdDetector;", "", "T", "", "jsonString", "decodeJson", "(Ljava/lang/String;)Ljava/lang/Object;", "", "Lcom/vungle/ads/internal/model/UnclosedAd;", "readUnclosedAdFromFile", "unclosedAdList", "Lbn/r;", "writeUnclosedAdToFile", "ad", "addUnclosedAd", "removeUnclosedAd", "retrieveUnclosedAd", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", JsonStorageKeyNames.SESSION_ID_KEY, "Ljava/lang/String;", "Lcom/vungle/ads/internal/executor/Executors;", "executors", "Lcom/vungle/ads/internal/executor/Executors;", "getExecutors", "()Lcom/vungle/ads/internal/executor/Executors;", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "Ljava/io/File;", C3978d4.i.f31327b, "Ljava/io/File;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "", C3978d4.i.f31361s, "Z", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/internal/executor/Executors;Lcom/vungle/ads/internal/util/PathProvider;)V", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class UnclosedAdDetector {

    @NotNull
    private static final String FILENAME = "unclosed_ad";

    @NotNull
    private final Context context;

    @NotNull
    private final Executors executors;

    @NotNull
    private File file;

    @NotNull
    private final PathProvider pathProvider;
    private boolean ready;

    @NotNull
    private final String sessionId;

    @NotNull
    private final CopyOnWriteArrayList<UnclosedAd> unclosedAdList;

    @NotNull
    private static final xo.a json = u.b(null, new l<d, r>() { // from class: com.vungle.ads.internal.session.UnclosedAdDetector$Companion$json$1
        @Override // sn.l
        public /* bridge */ /* synthetic */ r invoke(d dVar) {
            invoke2(dVar);
            return r.f5635a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull d dVar) {
            p.k(dVar, "$this$Json");
            dVar.f(true);
            dVar.d(true);
            dVar.e(false);
            dVar.c(true);
        }
    }, 1, null);

    public UnclosedAdDetector(@NotNull Context context, @NotNull String str, @NotNull Executors executors, @NotNull PathProvider pathProvider) {
        Object objM7534constructorimpl;
        boolean zM7540isSuccessimpl;
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(str, JsonStorageKeyNames.SESSION_ID_KEY);
        p.k(executors, "executors");
        p.k(pathProvider, "pathProvider");
        this.context = context;
        this.sessionId = str;
        this.executors = executors;
        this.pathProvider = pathProvider;
        this.file = pathProvider.getUnclosedAdFile(FILENAME);
        this.unclosedAdList = new CopyOnWriteArrayList<>();
        if (this.file.exists()) {
            zM7540isSuccessimpl = true;
        } else {
            try {
                Result.a aVar = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(Boolean.valueOf(this.file.createNewFile()));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
            if (thM7537exceptionOrNullimpl != null) {
                Logger.INSTANCE.e("UnclosedAdDetector", "Fail to create unclosed ad file: " + thM7537exceptionOrNullimpl.getMessage());
            }
            zM7540isSuccessimpl = Result.m7540isSuccessimpl(objM7534constructorimpl);
        }
        this.ready = zM7540isSuccessimpl;
    }

    private final /* synthetic */ <T> T decodeJson(String jsonString) {
        xo.a aVar = json;
        zo.c cVarA = aVar.a();
        p.q(6, "T");
        KSerializer<Object> kSerializerB = t.b(cVarA, null);
        p.i(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (T) aVar.c(kSerializerB, jsonString);
    }

    private final List<UnclosedAd> readUnclosedAdFromFile() {
        return !this.ready ? w.m() : (List) new FutureResult(this.executors.getIO_EXECUTOR().submit(new Callable() { // from class: com.vungle.ads.internal.session.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UnclosedAdDetector.m7340readUnclosedAdFromFile$lambda4(this.f53634b);
            }
        })).get(1000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readUnclosedAdFromFile$lambda-4, reason: not valid java name */
    public static final List m7340readUnclosedAdFromFile$lambda4(UnclosedAdDetector unclosedAdDetector) {
        p.k(unclosedAdDetector, "this$0");
        try {
            String string = FileUtility.INSTANCE.readString(unclosedAdDetector.file);
            if (string == null || string.length() == 0) {
                return new ArrayList();
            }
            xo.a aVar = json;
            KSerializer<Object> kSerializerB = t.b(aVar.a(), tn.t.n(List.class, KTypeProjection.Companion.invariant(tn.t.m(UnclosedAd.class))));
            p.i(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return (List) aVar.c(kSerializerB, string);
        } catch (Exception e10) {
            Logger.INSTANCE.e("UnclosedAdDetector", "Fail to read unclosed ad file " + e10.getMessage());
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: retrieveUnclosedAd$lambda-3, reason: not valid java name */
    public static final void m7341retrieveUnclosedAd$lambda3(UnclosedAdDetector unclosedAdDetector) {
        p.k(unclosedAdDetector, "this$0");
        try {
            FileUtility.deleteAndLogIfFailed(unclosedAdDetector.file);
        } catch (Exception e10) {
            Logger.INSTANCE.e("UnclosedAdDetector", "Fail to delete file " + e10.getMessage());
        }
    }

    private final void writeUnclosedAdToFile(List<UnclosedAd> list) {
        if (this.ready) {
            try {
                xo.a aVar = json;
                KSerializer<Object> kSerializerB = t.b(aVar.a(), tn.t.n(List.class, KTypeProjection.Companion.invariant(tn.t.m(UnclosedAd.class))));
                p.i(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                final String strB = aVar.b(kSerializerB, list);
                this.executors.getIO_EXECUTOR().execute(new Runnable() { // from class: com.vungle.ads.internal.session.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        UnclosedAdDetector.m7342writeUnclosedAdToFile$lambda5(this.f53632b, strB);
                    }
                });
            } catch (Throwable th2) {
                Logger.INSTANCE.e("UnclosedAdDetector", "Fail to write unclosed ad file " + th2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeUnclosedAdToFile$lambda-5, reason: not valid java name */
    public static final void m7342writeUnclosedAdToFile$lambda5(UnclosedAdDetector unclosedAdDetector, String str) {
        p.k(unclosedAdDetector, "this$0");
        p.k(str, "$jsonContent");
        FileUtility.INSTANCE.writeString(unclosedAdDetector.file, str);
    }

    public final void addUnclosedAd(@NotNull UnclosedAd unclosedAd) {
        p.k(unclosedAd, "ad");
        if (this.ready) {
            unclosedAd.setSessionId(this.sessionId);
            this.unclosedAdList.add(unclosedAd);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final Executors getExecutors() {
        return this.executors;
    }

    @NotNull
    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    public final void removeUnclosedAd(@NotNull UnclosedAd unclosedAd) {
        p.k(unclosedAd, "ad");
        if (this.ready && this.unclosedAdList.contains(unclosedAd)) {
            this.unclosedAdList.remove(unclosedAd);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    @NotNull
    public final List<UnclosedAd> retrieveUnclosedAd() {
        ArrayList arrayList = new ArrayList();
        if (!this.ready) {
            return arrayList;
        }
        List<UnclosedAd> unclosedAdFromFile = readUnclosedAdFromFile();
        if (unclosedAdFromFile != null) {
            arrayList.addAll(unclosedAdFromFile);
        }
        this.executors.getIO_EXECUTOR().execute(new Runnable() { // from class: com.vungle.ads.internal.session.a
            @Override // java.lang.Runnable
            public final void run() {
                UnclosedAdDetector.m7341retrieveUnclosedAd$lambda3(this.f53631b);
            }
        });
        return arrayList;
    }
}
