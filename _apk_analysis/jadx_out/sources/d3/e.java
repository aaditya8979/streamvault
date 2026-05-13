package d3;

import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import cn.a0;
import com.facebook.GraphRequest;
import com.facebook.internal.j0;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import k2.t;
import k2.z;
import kotlin.Metadata;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tn.p;
import tn.x;
import z2.j;

/* JADX INFO: compiled from: ErrorReportHandler.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Ld3/e;", "", "", NotificationCompat.CATEGORY_MESSAGE, "Lbn/r;", "g", "d", "h", "", "Ljava/io/File;", "e", "()[Ljava/io/File;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f59559a = new e();

    public static final void d() {
        if (t.p()) {
            h();
        }
    }

    @NotNull
    public static final File[] e() {
        File fileF = j.f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: d3.d
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return e.f(file, str);
            }
        });
        p.j(fileArrListFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return fileArrListFiles;
    }

    public static final boolean f(File file, String str) {
        p.j(str, "name");
        x xVar = x.f85368a;
        String str2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
        p.j(str2, "java.lang.String.format(format, *args)");
        return new Regex(str2).matches(str);
    }

    public static final void g(@Nullable String str) {
        try {
            new a(str).e();
        } catch (Exception unused) {
        }
    }

    public static final void h() {
        if (j0.U()) {
            return;
        }
        File[] fileArrE = e();
        final ArrayList arrayList = new ArrayList();
        int length = fileArrE.length;
        int i10 = 0;
        while (i10 < length) {
            File file = fileArrE[i10];
            i10++;
            a aVar = new a(file);
            if (aVar.d()) {
                arrayList.add(aVar);
            }
        }
        a0.D(arrayList, new Comparator() { // from class: d3.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.i((a) obj, (a) obj2);
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i11 = 0; i11 < arrayList.size() && i11 < 1000; i11++) {
            jSONArray.put(arrayList.get(i11));
        }
        j jVar = j.f98188a;
        j.s("error_reports", jSONArray, new GraphRequest.b() { // from class: d3.c
            @Override // com.facebook.GraphRequest.b
            public final void a(z zVar) {
                e.j(arrayList, zVar);
            }
        });
    }

    public static final int i(a aVar, a aVar2) {
        p.j(aVar2, "o2");
        return aVar.b(aVar2);
    }

    public static final void j(ArrayList arrayList, z zVar) {
        p.k(arrayList, "$validReports");
        p.k(zVar, "response");
        try {
            if (zVar.getError() == null) {
                JSONObject jSONObjectD = zVar.getJsonObject();
                if (p.f(jSONObjectD == null ? null : Boolean.valueOf(jSONObjectD.getBoolean("success")), Boolean.TRUE)) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }
}
