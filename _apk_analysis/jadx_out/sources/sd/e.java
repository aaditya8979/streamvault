package sd;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.mgs.carparking.ui.channelcontent.SpecialDetailNewActivity;
import com.mgs.carparking.ui.homecontent.more.VideoMoreListActivity;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.safedk.android.utils.Logger;
import ic.b0;
import zp.o;

/* JADX INFO: compiled from: ShowAppNoticePop.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f79651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f79652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f79653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f79654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AdInfoDetailEntry f79655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f79656f;

    /* JADX INFO: compiled from: ShowAppNoticePop.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ShowAppNoticePop.java */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f79658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f79659c;

        public b(AdInfoDetailEntry adInfoDetailEntry, Context context) {
            this.f79658b = adInfoDetailEntry;
            this.f79659c = context;
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (intent == null) {
                return;
            }
            context.startActivity(intent);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f79658b.getJump_type() == 3 && !o.b(this.f79658b.getJump_url())) {
                ed.a.a(e.this.f79653c, this.f79658b.getJump_url());
            } else if (this.f79658b.getJump_type() == 1) {
                Intent intent = new Intent(this.f79659c, (Class<?>) VideoPlayDetailActivity.class);
                intent.putExtra("id", Integer.parseInt(this.f79658b.getJump_url()));
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f79659c, intent);
            } else if (this.f79658b.getJump_type() == 4) {
                Intent intent2 = new Intent(this.f79659c, (Class<?>) VideoMoreListActivity.class);
                intent2.putExtra("videoTitle", this.f79658b.getTitle());
                intent2.putExtra("videoModuleId", Integer.parseInt(this.f79658b.getJump_url()));
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f79659c, intent2);
            } else if (this.f79658b.getJump_type() == 7) {
                Intent intent3 = new Intent(this.f79659c, (Class<?>) SpecialDetailNewActivity.class);
                intent3.putExtra("id", Integer.parseInt(this.f79658b.getJump_url()));
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f79659c, intent3);
            } else if (this.f79658b.getJump_type() > 100 && this.f79658b.getJump_type() < 106) {
                op.a.a().b(new b0(this.f79658b.getJump_type()));
                e.this.dismiss();
            }
            if (this.f79658b.is_allow_close() == 1) {
                e.this.dismiss();
            }
            c cVar = e.this.f79656f;
            if (cVar != null) {
                cVar.a(true);
            }
        }
    }

    /* JADX INFO: compiled from: ShowAppNoticePop.java */
    public interface c {
        void a(boolean z10);
    }

    public e(Context context, AdInfoDetailEntry adInfoDetailEntry) {
        super(context);
        this.f79653c = context;
        this.f79655e = adInfoDetailEntry;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_show_app_notice, (ViewGroup) null);
        this.f79651a = (ImageView) viewInflate.findViewById(R.id.iv_feedback_close);
        this.f79652b = (TextView) viewInflate.findViewById(R.id.tv_submit);
        this.f79654d = (TextView) viewInflate.findViewById(R.id.tv_content);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        if (!o.b(adInfoDetailEntry.getTitle())) {
            textView.setText(adInfoDetailEntry.getTitle());
        }
        if (!o.b(adInfoDetailEntry.getContent())) {
            this.f79654d.setText(adInfoDetailEntry.getContent());
        }
        this.f79652b.setText(adInfoDetailEntry.getBtn_content());
        if (adInfoDetailEntry.is_allow_close() == 1) {
            this.f79651a.setVisibility(0);
        } else {
            this.f79651a.setVisibility(8);
        }
        this.f79651a.setOnClickListener(new a());
        this.f79652b.setOnClickListener(new b(adInfoDetailEntry, context));
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(false);
        setFocusable(false);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background1));
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }
}
