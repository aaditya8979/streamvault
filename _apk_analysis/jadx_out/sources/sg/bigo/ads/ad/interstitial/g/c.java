package sg.bigo.ads.ad.interstitial.g;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.view.ViewCompat;
import io.bidmachine.media3.ui.DefaultTimeBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Integer> f81006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Integer> f81007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f81008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f81009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f81010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f81011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f81012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f81013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f81014i;

    public c(Context context) {
        this(context, (byte) 0);
    }

    private c(Context context, byte b10) {
        this(context, (char) 0);
    }

    private c(Context context, char c10) {
        super(context, null, 0);
        this.f81006a = new HashMap();
        this.f81007b = new HashMap();
        this.f81008c = new ArrayList();
        this.f81009d = null;
        this.f81010e = 1;
        this.f81013h = sg.bigo.ads.common.utils.e.a(context, 2);
        this.f81014i = sg.bigo.ads.common.utils.e.a(context, 8);
        this.f81011f = new Paint(1);
        this.f81012g = new Paint(1);
        a();
    }

    private void a() {
        Paint paint;
        int i10;
        if (this.f81010e == 1) {
            this.f81011f.setColor(-1);
            paint = this.f81012g;
            i10 = DefaultTimeBar.DEFAULT_UNPLAYED_COLOR;
        } else {
            this.f81011f.setColor(ViewCompat.MEASURED_STATE_MASK);
            paint = this.f81012g;
            i10 = 855638016;
        }
        paint.setColor(i10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f81006a.isEmpty()) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i10 = this.f81013h;
        int i11 = (height - i10) / 2;
        int i12 = i10 + i11;
        int size = this.f81006a.size();
        if (size == 0) {
            return;
        }
        int i13 = (width - ((size - 1) * this.f81014i)) / size;
        int i14 = 0;
        for (String str : this.f81008c) {
            Integer num = this.f81006a.get(str);
            Integer num2 = this.f81007b.get(str);
            if (num != null && num2 != null && num.intValue() > 0) {
                int i15 = (this.f81014i + i13) * i14;
                int i16 = 0;
                while (i16 < num.intValue()) {
                    canvas.drawRect((i16 * (i13 / num.intValue())) + i15, i11, i16 == num.intValue() + (-1) ? i15 + i13 : r11 + r12, i12, i16 < num2.intValue() ? this.f81011f : this.f81012g);
                    i16++;
                }
                i14++;
            }
        }
    }

    public final void setStyleType$2563266(int i10) {
        this.f81010e = i10;
        a();
        invalidate();
    }

    public final void setTotalNum(Map<String, Integer> map) {
        this.f81006a.clear();
        this.f81007b.clear();
        this.f81008c.clear();
        this.f81009d = null;
        if (map != null) {
            this.f81006a.putAll(map);
            this.f81008c.addAll(map.keySet());
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                this.f81007b.put(it.next(), 0);
            }
        }
    }
}
