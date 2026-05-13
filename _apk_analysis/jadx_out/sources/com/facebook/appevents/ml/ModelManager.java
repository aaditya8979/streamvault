package com.facebook.appevents.ml;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import bo.a0;
import bo.d0;
import cn.k0;
import cn.w;
import cn.x;
import com.facebook.GraphRequest;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.j0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3978d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.internal.h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k2.t;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s2.j;
import tn.i;
import tn.p;
import w2.e;
import zn.n;

/* JADX INFO: compiled from: ModelManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001:\u000234B\t\b\u0002¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J;\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J'\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J'\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010!R\"\u0010'\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u00100\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00065"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager;", "", "Lbn/r;", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/facebook/appevents/ml/ModelManager$Task;", "task", "Ljava/io/File;", "l", "", "", "denses", "", "texts", "q", "(Lcom/facebook/appevents/ml/ModelManager$Task;[[F[Ljava/lang/String;)[Ljava/lang/String;", "", "timestamp", "", "n", "Lorg/json/JSONObject;", "models", "e", "jsonObject", "p", CampaignEx.JSON_KEY_AD_K, "h", "Lorg/json/JSONArray;", "jsonArray", "o", "Lt2/a;", "res", "thresholds", "s", "(Lt2/a;[F)[Ljava/lang/String;", "r", "", "Lcom/facebook/appevents/ml/ModelManager$a;", "b", "Ljava/util/Map;", "taskHandlers", "", "c", "Ljava/util/List;", "MTML_SUGGESTED_EVENTS_PREDICTION", "d", "MTML_INTEGRITY_DETECT_PREDICTION", InneractiveMediationDefs.GENDER_MALE, "()Z", "isLocaleEnglish", "<init>", "()V", "Task", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class ModelManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ModelManager f15217a = new ModelManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Map<String, a> taskHandlers = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<String> MTML_SUGGESTED_EVENTS_PREDICTION = w.p("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<String> MTML_INTEGRITY_DETECT_PREDICTION = w.p("none", "address", "health");

    /* JADX INFO: compiled from: ModelManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager$Task;", "", "(Ljava/lang/String;I)V", "toKey", "", "toUseCase", "MTML_INTEGRITY_DETECT", "MTML_APP_EVENT_PREDICTION", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* JADX INFO: compiled from: ModelManager.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Task.valuesCustom().length];
                iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Task[] valuesCustom() {
            Task[] taskArrValuesCustom = values();
            return (Task[]) Arrays.copyOf(taskArrValuesCustom, taskArrValuesCustom.length);
        }

        @NotNull
        public final String toKey() {
            int i10 = a.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "integrity_detect";
            }
            if (i10 == 2) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        @NotNull
        public final String toUseCase() {
            int i10 = a.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i10 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: compiled from: ModelManager.kt */
    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ,2\u00020\u0001:\u0001\u0006B3\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0014\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b0\u00101J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010(\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010$\u001a\u0004\b\u0015\u0010%\"\u0004\b&\u0010'R$\u0010.\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010*\u001a\u0004\b\u0010\u0010+\"\u0004\b,\u0010-R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010/¨\u00062"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager$a;", "", "Ljava/lang/Runnable;", "onPostExecute", "j", "", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "setUseCase", "(Ljava/lang/String;)V", "useCase", "b", "setAssetUri", "assetUri", "c", "e", "setRuleUri", "ruleUri", "", "d", "I", "h", "()I", "setVersionId", "(I)V", "versionId", "", "[F", InneractiveMediationDefs.GENDER_FEMALE, "()[F", "setThresholds", "([F)V", "thresholds", "Ljava/io/File;", "Ljava/io/File;", "()Ljava/io/File;", CampaignEx.JSON_KEY_AD_K, "(Ljava/io/File;)V", "ruleFile", "Lt2/b;", "Lt2/b;", "()Lt2/b;", "i", "(Lt2/b;)V", "model", "Ljava/lang/Runnable;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[F)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String useCase;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String assetUri;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String ruleUri;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public int versionId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public float[] thresholds;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public File ruleFile;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public t2.b model;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Runnable onPostExecute;

        /* JADX INFO: renamed from: com.facebook.appevents.ml.ModelManager$a$a, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: ModelManager.kt */
        @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\"\u0010\u0014\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¨\u0006\u0017"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager$a$a;", "", "Lorg/json/JSONObject;", "json", "Lcom/facebook/appevents/ml/ModelManager$a;", "c", h.f53012a, "", "slaves", "Lbn/r;", InneractiveMediationDefs.GENDER_FEMALE, "", "useCase", "", "versionId", "d", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "name", "Ls2/j$a;", "onComplete", "e", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public static final void g(List list, File file) {
                p.k(list, "$slaves");
                p.k(file, C3978d4.i.f31327b);
                final t2.b bVarA = t2.b.INSTANCE.a(file);
                if (bVarA != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        final a aVar = (a) it.next();
                        a.INSTANCE.e(aVar.getRuleUri(), aVar.getUseCase() + '_' + aVar.getVersionId() + "_rule", new j.a() { // from class: t2.g
                            @Override // s2.j.a
                            public final void a(File file2) {
                                ModelManager.a.Companion.h(aVar, bVarA, file2);
                            }
                        });
                    }
                }
            }

            public static final void h(a aVar, t2.b bVar, File file) {
                p.k(aVar, "$slave");
                p.k(file, C3978d4.i.f31327b);
                aVar.i(bVar);
                aVar.k(file);
                Runnable runnable = aVar.onPostExecute;
                if (runnable == null) {
                    return;
                }
                runnable.run();
            }

            @Nullable
            public final a c(@Nullable JSONObject json) {
                if (json == null) {
                    return null;
                }
                try {
                    String string = json.getString("use_case");
                    String string2 = json.getString("asset_uri");
                    String strOptString = json.optString("rules_uri", null);
                    int i10 = json.getInt("version_id");
                    float[] fArrD = ModelManager.d(ModelManager.f15217a, json.getJSONArray("thresholds"));
                    p.j(string, "useCase");
                    p.j(string2, "assetUri");
                    return new a(string, string2, strOptString, i10, fArrD);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void d(String str, int i10) {
                File[] fileArrListFiles;
                File fileA = t2.i.a();
                if (fileA == null || (fileArrListFiles = fileA.listFiles()) == null) {
                    return;
                }
                if (fileArrListFiles.length == 0) {
                    return;
                }
                String str2 = str + '_' + i10;
                int length = fileArrListFiles.length;
                int i11 = 0;
                while (i11 < length) {
                    File file = fileArrListFiles[i11];
                    i11++;
                    String name = file.getName();
                    p.j(name, "name");
                    if (a0.W(name, str, false, 2, null) && !a0.W(name, str2, false, 2, null)) {
                        file.delete();
                    }
                }
            }

            public final void e(String str, String str2, j.a aVar) {
                File file = new File(t2.i.a(), str2);
                if (str == null || file.exists()) {
                    aVar.a(file);
                } else {
                    new j(str, file, aVar).execute(new String[0]);
                }
            }

            public final void f(@NotNull a aVar, @NotNull final List<a> list) {
                p.k(aVar, h.f53012a);
                p.k(list, "slaves");
                d(aVar.getUseCase(), aVar.getVersionId());
                e(aVar.getAssetUri(), aVar.getUseCase() + '_' + aVar.getVersionId(), new j.a() { // from class: t2.f
                    @Override // s2.j.a
                    public final void a(File file) {
                        ModelManager.a.Companion.g(list, file);
                    }
                });
            }
        }

        public a(@NotNull String str, @NotNull String str2, @Nullable String str3, int i10, @Nullable float[] fArr) {
            p.k(str, "useCase");
            p.k(str2, "assetUri");
            this.useCase = str;
            this.assetUri = str2;
            this.ruleUri = str3;
            this.versionId = i10;
            this.thresholds = fArr;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAssetUri() {
            return this.assetUri;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final t2.b getModel() {
            return this.model;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final File getRuleFile() {
            return this.ruleFile;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getRuleUri() {
            return this.ruleUri;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final float[] getThresholds() {
            return this.thresholds;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getUseCase() {
            return this.useCase;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getVersionId() {
            return this.versionId;
        }

        public final void i(@Nullable t2.b bVar) {
            this.model = bVar;
        }

        @NotNull
        public final a j(@Nullable Runnable onPostExecute) {
            this.onPostExecute = onPostExecute;
            return this;
        }

        public final void k(@Nullable File file) {
            this.ruleFile = file;
        }
    }

    /* JADX INFO: compiled from: ModelManager.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Task.valuesCustom().length];
            iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ float[] d(ModelManager modelManager, JSONArray jSONArray) {
        if (c3.a.d(ModelManager.class)) {
            return null;
        }
        try {
            return modelManager.o(jSONArray);
        } catch (Throwable th2) {
            c3.a.b(th2, ModelManager.class);
            return null;
        }
    }

    public static final void f() {
        if (c3.a.d(ModelManager.class)) {
            return;
        }
        try {
            j0 j0Var = j0.f15387a;
            j0.w0(new Runnable() { // from class: t2.c
                @Override // java.lang.Runnable
                public final void run() {
                    ModelManager.g();
                }
            });
        } catch (Throwable th2) {
            c3.a.b(th2, ModelManager.class);
        }
    }

    public static final void g() {
        JSONObject jSONObject;
        if (c3.a.d(ModelManager.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = t.l().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
            String string = sharedPreferences.getString("models", null);
            if (string != null) {
                jSONObject = string.length() == 0 ? new JSONObject() : new JSONObject(string);
            }
            long j10 = sharedPreferences.getLong("model_request_timestamp", 0L);
            FeatureManager featureManager = FeatureManager.f15284a;
            if (!FeatureManager.g(FeatureManager.Feature.ModelRequest) || jSONObject.length() == 0 || !f15217a.n(j10)) {
                jSONObject = f15217a.k();
                if (jSONObject == null) {
                    return;
                } else {
                    sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                }
            }
            ModelManager modelManager = f15217a;
            modelManager.e(jSONObject);
            modelManager.h();
        } catch (Exception unused) {
        } catch (Throwable th2) {
            c3.a.b(th2, ModelManager.class);
        }
    }

    public static final void i() {
        if (c3.a.d(ModelManager.class)) {
            return;
        }
        try {
            e.b();
        } catch (Throwable th2) {
            c3.a.b(th2, ModelManager.class);
        }
    }

    public static final void j() {
        if (c3.a.d(ModelManager.class)) {
            return;
        }
        try {
            r2.a.a();
        } catch (Throwable th2) {
            c3.a.b(th2, ModelManager.class);
        }
    }

    @Nullable
    public static final File l(@NotNull Task task) {
        if (c3.a.d(ModelManager.class)) {
            return null;
        }
        try {
            p.k(task, "task");
            a aVar = taskHandlers.get(task.toUseCase());
            if (aVar == null) {
                return null;
            }
            return aVar.getRuleFile();
        } catch (Throwable th2) {
            c3.a.b(th2, ModelManager.class);
            return null;
        }
    }

    @Nullable
    public static final String[] q(@NotNull Task task, @NotNull float[][] denses, @NotNull String[] texts) {
        if (c3.a.d(ModelManager.class)) {
            return null;
        }
        try {
            p.k(task, "task");
            p.k(denses, "denses");
            p.k(texts, "texts");
            a aVar = taskHandlers.get(task.toUseCase());
            t2.b model = aVar == null ? null : aVar.getModel();
            if (model == null) {
                return null;
            }
            float[] thresholds = aVar.getThresholds();
            int length = texts.length;
            int length2 = denses[0].length;
            t2.a aVar2 = new t2.a(new int[]{length, length2});
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    System.arraycopy(denses[i10], 0, aVar2.getData(), i10 * length2, length2);
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            t2.a aVarB = model.b(aVar2, texts, task.toKey());
            if (aVarB != null && thresholds != null) {
                if (!(aVarB.getData().length == 0)) {
                    if (!(thresholds.length == 0)) {
                        int i12 = b.$EnumSwitchMapping$0[task.ordinal()];
                        if (i12 == 1) {
                            return f15217a.s(aVarB, thresholds);
                        }
                        if (i12 == 2) {
                            return f15217a.r(aVarB, thresholds);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            c3.a.b(th2, ModelManager.class);
            return null;
        }
    }

    public final void e(JSONObject jSONObject) {
        if (c3.a.d(this)) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    a aVarC = a.INSTANCE.c(jSONObject.getJSONObject(itKeys.next()));
                    if (aVarC != null) {
                        taskHandlers.put(aVarC.getUseCase(), aVarC);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    public final void h() {
        if (c3.a.d(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String assetUri = null;
            int iMax = 0;
            for (Map.Entry<String, a> entry : taskHandlers.entrySet()) {
                String key = entry.getKey();
                a value = entry.getValue();
                if (p.f(key, Task.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                    String assetUri2 = value.getAssetUri();
                    int iMax2 = Math.max(iMax, value.getVersionId());
                    FeatureManager featureManager = FeatureManager.f15284a;
                    if (FeatureManager.g(FeatureManager.Feature.SuggestedEvents) && m()) {
                        arrayList.add(value.j(new Runnable() { // from class: t2.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                ModelManager.i();
                            }
                        }));
                    }
                    assetUri = assetUri2;
                    iMax = iMax2;
                }
                if (p.f(key, Task.MTML_INTEGRITY_DETECT.toUseCase())) {
                    assetUri = value.getAssetUri();
                    iMax = Math.max(iMax, value.getVersionId());
                    FeatureManager featureManager2 = FeatureManager.f15284a;
                    if (FeatureManager.g(FeatureManager.Feature.IntelligentIntegrity)) {
                        arrayList.add(value.j(new Runnable() { // from class: t2.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                ModelManager.j();
                            }
                        }));
                    }
                }
            }
            if (assetUri == null || iMax <= 0 || arrayList.isEmpty()) {
                return;
            }
            a.INSTANCE.f(new a("MTML", assetUri, null, iMax, null), arrayList);
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    public final JSONObject k() {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(StringUtils.COMMA, new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            GraphRequest graphRequestX = GraphRequest.INSTANCE.x(null, "app/model_asset", null);
            graphRequestX.G(bundle);
            JSONObject graphObject = graphRequestX.k().getGraphObject();
            if (graphObject == null) {
                return null;
            }
            return p(graphObject);
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    public final boolean m() {
        if (c3.a.d(this)) {
            return false;
        }
        try {
            Locale localeJ = j0.J();
            if (localeJ != null) {
                String language = localeJ.getLanguage();
                p.j(language, "locale.language");
                if (!d0.c0(language, "en", false, 2, null)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return false;
        }
    }

    public final boolean n(long timestamp) {
        if (c3.a.d(this) || timestamp == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - timestamp < 259200000;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return false;
        }
    }

    public final float[] o(JSONArray jsonArray) {
        if (c3.a.d(this) || jsonArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jsonArray.length()];
            int i10 = 0;
            int length = jsonArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        String string = jsonArray.getString(i10);
                        p.j(string, "jsonArray.getString(i)");
                        fArr[i10] = Float.parseFloat(string);
                    } catch (JSONException unused) {
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return fArr;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    public final JSONObject p(JSONObject jsonObject) {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = jsonObject.getJSONArray("data");
                int i10 = 0;
                int length = jSONArray.length();
                if (length <= 0) {
                    return jSONObject;
                }
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("version_id", jSONObject2.getString("version_id"));
                    jSONObject3.put("use_case", jSONObject2.getString("use_case"));
                    jSONObject3.put("thresholds", jSONObject2.getJSONArray("thresholds"));
                    jSONObject3.put("asset_uri", jSONObject2.getString("asset_uri"));
                    if (jSONObject2.has("rules_uri")) {
                        jSONObject3.put("rules_uri", jSONObject2.getString("rules_uri"));
                    }
                    jSONObject.put(jSONObject2.getString("use_case"), jSONObject3);
                    if (i11 >= length) {
                        return jSONObject;
                    }
                    i10 = i11;
                }
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
        c3.a.b(th2, this);
        return null;
    }

    public final String[] r(t2.a res, float[] thresholds) {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            int iB = res.b(0);
            int iB2 = res.b(1);
            float[] data = res.getData();
            if (iB2 != thresholds.length) {
                return null;
            }
            zn.i iVarV = n.v(0, iB);
            ArrayList arrayList = new ArrayList(x.x(iVarV, 10));
            Iterator<Integer> it = iVarV.iterator();
            while (it.hasNext()) {
                int iNextInt = ((k0) it).nextInt();
                String str = "none";
                int length = thresholds.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (data[(iNextInt * iB2) + i11] >= thresholds[i10]) {
                        str = MTML_INTEGRITY_DETECT_PREDICTION.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    public final String[] s(t2.a res, float[] thresholds) {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            int iB = res.b(0);
            int iB2 = res.b(1);
            float[] data = res.getData();
            if (iB2 != thresholds.length) {
                return null;
            }
            zn.i iVarV = n.v(0, iB);
            ArrayList arrayList = new ArrayList(x.x(iVarV, 10));
            Iterator<Integer> it = iVarV.iterator();
            while (it.hasNext()) {
                int iNextInt = ((k0) it).nextInt();
                String str = "other";
                int length = thresholds.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (data[(iNextInt * iB2) + i11] >= thresholds[i10]) {
                        str = MTML_SUGGESTED_EVENTS_PREDICTION.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }
}
