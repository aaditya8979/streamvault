package sd;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.db.AdNumShowDao;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import java.util.List;

/* JADX INFO: compiled from: ShowVideoUpdatePop.java */
/* JADX INFO: loaded from: classes.dex */
public class g extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f79672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f79673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f79674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f79675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Activity f79676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f79677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f79678g;

    /* JADX INFO: compiled from: ShowVideoUpdatePop.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.dismiss();
        }
    }

    public g(Context context, Activity activity, int i10, int i11) {
        super(context);
        this.f79674c = new Handler();
        this.f79675d = context;
        this.f79676e = activity;
        this.f79677f = i10;
        this.f79678g = i11;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_show_video_update, (ViewGroup) null);
        this.f79672a = (TextView) viewInflate.findViewById(R.id.tv_cancel);
        this.f79673b = (TextView) viewInflate.findViewById(R.id.tv_sure);
        this.f79672a.setOnClickListener(new a());
        a();
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(false);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background1));
    }

    public void a() {
        if (AppApplication.adInfoEntry.getAd_position_10() == null || AppApplication.adInfoEntry.getAd_position_10().size() <= 0) {
            return;
        }
        List<AdInfoDetailEntry> ad_position_10 = AppApplication.adInfoEntry.getAd_position_10();
        int num = AdNumShowDao.getInstance().getNum(26);
        if (num >= ad_position_10.size() - 1) {
            b(ad_position_10, this.f79676e, this.f79673b, this.f79674c, 0);
        } else {
            b(ad_position_10, this.f79676e, this.f79673b, this.f79674c, num + 1);
        }
    }

    public void b(List<AdInfoDetailEntry> list, Activity activity, View view, Handler handler, int i10) {
        int i11;
        AdInfoDetailEntry adInfoDetailEntry = list.get(i10);
        if (adInfoDetailEntry.getAd_source_id() == 1) {
            if (adInfoDetailEntry.getNum() <= 0) {
                AdNumShowDao.getInstance().updateUpdateIndex(i10);
                return;
            }
            if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(15)) {
                AdNumShowDao.getInstance().updateUpdateIndex(i10);
                return;
            }
            int i12 = i10 + 1;
            i11 = i12 != list.size() ? i12 : 0;
            list.get(i11);
            AdNumShowDao.getInstance().updateUpdateIndex(i11);
            return;
        }
        if (adInfoDetailEntry.getAd_source_id() == 2) {
            if (adInfoDetailEntry.getNum() <= 0) {
                AdNumShowDao.getInstance().updateUpdateIndex(i10);
                return;
            }
            if (adInfoDetailEntry.getNum() > AdNumShowDao.getInstance().getNum(16)) {
                AdNumShowDao.getInstance().updateUpdateIndex(i10);
                return;
            }
            int i13 = i10 + 1;
            i11 = i13 != list.size() ? i13 : 0;
            list.get(i11);
            AdNumShowDao.getInstance().updateUpdateIndex(i11);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }
}
