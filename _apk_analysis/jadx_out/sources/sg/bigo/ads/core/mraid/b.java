package sg.bigo.ads.core.mraid;

import android.graphics.Rect;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f84090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f84091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Rect> f84092c;

    public b(float f10, Rect rect, List<Rect> list) {
        this.f84090a = f10;
        this.f84091b = rect;
        this.f84092c = list;
    }

    public static JSONArray a(List<Rect> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<Rect> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(a(it.next()));
        }
        return jSONArray;
    }

    public static JSONObject a(Rect rect) {
        if (rect == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(VastAttributes.HORIZONTAL_POSITION, rect.left);
            jSONObject.put(VastAttributes.VERTICAL_POSITION, rect.top);
            jSONObject.put("width", rect.width());
            jSONObject.put("height", rect.height());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
