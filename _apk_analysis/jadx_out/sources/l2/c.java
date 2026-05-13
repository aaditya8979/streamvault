package l2;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import bo.d0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: MetadataMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J$\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0007J\u001e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0014"}, d2 = {"Ll2/c;", "", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "", "b", "a", "indicators", "keys", "", "e", "text", "rule", InneractiveMediationDefs.GENDER_FEMALE, "indicator", "d", "c", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f73625a = new c();

    @NotNull
    public static final List<String> a(@NotNull View view) {
        if (c3.a.d(c.class)) {
            return null;
        }
        try {
            p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroupJ = o2.d.j(view);
            if (viewGroupJ != null) {
                for (View view2 : o2.d.b(viewGroupJ)) {
                    if (view != view2) {
                        arrayList.addAll(f73625a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            c3.a.b(th2, c.class);
            return null;
        }
    }

    @NotNull
    public static final List<String> b(@NotNull View view) {
        if (c3.a.d(c.class)) {
            return null;
        }
        try {
            p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(o2.d.i(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    p.j(resourceName, "resourceName");
                    Object[] array = new Regex("/").split(resourceName, 0).toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr = (String[]) array;
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if ((str.length() > 0) && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    p.j(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th2) {
            c3.a.b(th2, c.class);
            return null;
        }
    }

    public static final boolean e(@NotNull List<String> indicators, @NotNull List<String> keys) {
        if (c3.a.d(c.class)) {
            return false;
        }
        try {
            p.k(indicators, "indicators");
            p.k(keys, "keys");
            Iterator<String> it = indicators.iterator();
            while (it.hasNext()) {
                if (f73625a.d(it.next(), keys)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            c3.a.b(th2, c.class);
            return false;
        }
    }

    public static final boolean f(@NotNull String text, @NotNull String rule) {
        if (c3.a.d(c.class)) {
            return false;
        }
        try {
            p.k(text, "text");
            p.k(rule, "rule");
            return new Regex(rule).matches(text);
        } catch (Throwable th2) {
            c3.a.b(th2, c.class);
            return false;
        }
    }

    public final List<String> c(View view) {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (!(view instanceof TextView)) {
                Iterator<View> it = o2.d.b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(c(it.next()));
                }
                return arrayList;
            }
            String string = ((TextView) view).getText().toString();
            if ((string.length() > 0) && string.length() < 100) {
                String lowerCase = string.toLowerCase();
                p.j(lowerCase, "(this as java.lang.String).toLowerCase()");
                arrayList.add(lowerCase);
            }
            return arrayList;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    public final boolean d(String indicator, List<String> keys) {
        if (c3.a.d(this)) {
            return false;
        }
        try {
            Iterator<String> it = keys.iterator();
            while (it.hasNext()) {
                if (d0.c0(indicator, it.next(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return false;
        }
    }
}
