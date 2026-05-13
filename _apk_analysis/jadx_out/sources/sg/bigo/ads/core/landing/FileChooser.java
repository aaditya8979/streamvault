package sg.bigo.ads.core.landing;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.annotation.Keep;
import com.safedk.android.utils.Logger;
import java.io.Serializable;
import java.util.ArrayList;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public class FileChooser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f84039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueCallback<Uri> f84040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ValueCallback<Uri[]> f84041c;

    public FileChooser(Activity activity) {
        this.f84039a = activity;
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity activity, Intent intent, int i10) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (intent == null) {
            return;
        }
        activity.startActivityForResult(intent, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.Serializable, java.lang.Object[]] */
    public final void a(String... strArr) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            for (String str : strArr) {
                if (!q.a((CharSequence) str)) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList.isEmpty()) {
            intent.setType("*/*");
        } else {
            intent.setType((String) arrayList.get(0));
            if (arrayList.size() > 1) {
                intent.putExtra("android.intent.extra.MIME_TYPES", (Serializable) arrayList.toArray());
            }
        }
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this.f84039a, Intent.createChooser(intent, "Select File"), 101);
    }

    @Keep
    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        sg.bigo.ads.common.t.a.a(0, 3, "FileChooser", "openFileChooser");
        this.f84040b = valueCallback;
        a(str);
    }
}
