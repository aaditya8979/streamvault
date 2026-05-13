package z2;

import androidx.annotation.RestrictTo;
import bo.a0;
import com.facebook.GraphRequest;
import com.facebook.internal.j0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import k2.t;
import kotlin.Metadata;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tn.p;
import tn.x;

/* JADX INFO: compiled from: InstrumentUtility.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\tH\u0007J\u001c\u0010\u0018\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0019\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J$\u0010\u001f\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007J\n\u0010 \u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0007¨\u0006&"}, d2 = {"Lz2/j;", "", "", "e", "", "h", "Ljava/lang/Thread;", "thread", "g", "", "j", CampaignEx.JSON_KEY_AD_K, "", "Ljava/io/File;", "l", "()[Ljava/io/File;", "n", "p", "filename", "deleteOnException", "Lorg/json/JSONObject;", "r", "content", "Lbn/r;", "t", "d", "key", "Lorg/json/JSONArray;", Z7.f30778b, "Lcom/facebook/GraphRequest$b;", "callback", "s", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/lang/StackTraceElement;", "element", "i", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f98188a = new j();

    public static final boolean d(@Nullable String filename) {
        File fileF = f();
        if (fileF == null || filename == null) {
            return false;
        }
        return new File(fileF, filename).delete();
    }

    @Nullable
    public static final String e(@Nullable Throwable e10) {
        if (e10 == null) {
            return null;
        }
        return e10.getCause() == null ? e10.toString() : String.valueOf(e10.getCause());
    }

    @Nullable
    public static final File f() {
        File file = new File(t.l().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @Nullable
    public static final String g(@NotNull Thread thread) {
        p.k(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        p.j(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i10 = 0;
        while (i10 < length) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            i10++;
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    @Nullable
    public static final String h(@Nullable Throwable e10) {
        Throwable th2 = null;
        if (e10 == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (e10 != null && e10 != th2) {
            StackTraceElement[] stackTrace = e10.getStackTrace();
            p.j(stackTrace, "t.stackTrace");
            int i10 = 0;
            int length = stackTrace.length;
            while (i10 < length) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                i10++;
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = e10;
            e10 = e10.getCause();
        }
        return jSONArray.toString();
    }

    public static final boolean i(@NotNull StackTraceElement element) {
        p.k(element, "element");
        String className = element.getClassName();
        p.j(className, "element.className");
        if (!a0.W(className, "com.facebook", false, 2, null)) {
            String className2 = element.getClassName();
            p.j(className2, "element.className");
            if (!a0.W(className2, "com.meta", false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean j(@Nullable Throwable e10) {
        if (e10 == null) {
            return false;
        }
        Throwable th2 = null;
        while (e10 != null && e10 != th2) {
            StackTraceElement[] stackTrace = e10.getStackTrace();
            p.j(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i10 = 0;
            while (i10 < length) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                i10++;
                p.j(stackTraceElement, "element");
                if (i(stackTraceElement)) {
                    return true;
                }
            }
            th2 = e10;
            e10 = e10.getCause();
        }
        return false;
    }

    public static final boolean k(@Nullable Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                p.j(stackTraceElement, "element");
                if (i(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    p.j(className, "element.className");
                    if (!a0.W(className, "com.facebook.appevents.codeless", false, 2, null)) {
                        String className2 = stackTraceElement.getClassName();
                        p.j(className2, "element.className");
                        if (!a0.W(className2, "com.facebook.appevents.suggestedevents", false, 2, null)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    p.j(methodName, "element.methodName");
                    if (a0.W(methodName, "onClick", false, 2, null)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        p.j(methodName2, "element.methodName");
                        if (a0.W(methodName2, "onItemClick", false, 2, null)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            p.j(methodName3, "element.methodName");
                            if (!a0.W(methodName3, "onTouch", false, 2, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    public static final File[] l() {
        File fileF = f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: z2.i
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return j.m(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    public static final boolean m(File file, String str) {
        p.j(str, "name");
        x xVar = x.f85368a;
        String str2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
        p.j(str2, "java.lang.String.format(format, *args)");
        return new Regex(str2).matches(str);
    }

    @NotNull
    public static final File[] n() {
        File fileF = f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: z2.h
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return j.o(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    public static final boolean o(File file, String str) {
        p.j(str, "name");
        x xVar = x.f85368a;
        String str2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
        p.j(str2, "java.lang.String.format(format, *args)");
        return new Regex(str2).matches(str);
    }

    @NotNull
    public static final File[] p() {
        File fileF = f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: z2.g
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return j.q(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    public static final boolean q(File file, String str) {
        p.j(str, "name");
        x xVar = x.f85368a;
        String str2 = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
        p.j(str2, "java.lang.String.format(format, *args)");
        return new Regex(str2).matches(str);
    }

    @Nullable
    public static final JSONObject r(@Nullable String filename, boolean deleteOnException) {
        File fileF = f();
        if (fileF != null && filename != null) {
            try {
                return new JSONObject(j0.n0(new FileInputStream(new File(fileF, filename))));
            } catch (Exception unused) {
                if (deleteOnException) {
                    d(filename);
                }
            }
        }
        return null;
    }

    public static final void s(@Nullable String str, @NotNull JSONArray jSONArray, @Nullable GraphRequest.b bVar) {
        p.k(jSONArray, Z7.f30778b);
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject jSONObjectA = j0.A();
            if (jSONObjectA != null) {
                Iterator<String> itKeys = jSONObjectA.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectA.get(next));
                }
            }
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            x xVar = x.f85368a;
            String str2 = String.format("%s/instruments", Arrays.copyOf(new Object[]{t.m()}, 1));
            p.j(str2, "java.lang.String.format(format, *args)");
            companion.A(null, str2, jSONObject, bVar).l();
        } catch (JSONException unused) {
        }
    }

    public static final void t(@Nullable String str, @Nullable String str2) {
        File fileF = f();
        if (fileF == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileF, str));
            byte[] bytes = str2.getBytes(bo.c.f5639b);
            p.j(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
