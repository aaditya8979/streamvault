package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.ironsource.Z7;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VodFeedbackEntry;
import com.mgs.carparking.widgets.dialog.FeedbackTagAdapter;
import ed.l0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import zp.o;
import zp.p;

/* JADX INFO: compiled from: VideoDetailLandFeedbackPop.java */
/* JADX INFO: loaded from: classes9.dex */
public class c extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f45373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f45374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f45375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f45376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FeedbackTagAdapter f45377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<VodFeedbackEntry> f45378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f45379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f45380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f45381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecommandVideosEntity f45382j;

    /* JADX INFO: compiled from: VideoDetailLandFeedbackPop.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoDetailLandFeedbackPop.java */
    public class b implements FeedbackTagAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f45384a;

        public b(Context context) {
            this.f45384a = context;
        }

        @Override // com.mgs.carparking.widgets.dialog.FeedbackTagAdapter.c
        public void a(int i10) {
            c.this.f45377e.g(c.this.f45378f, i10);
            c.this.f45374b.setTextColor(this.f45384a.getResources().getColor(R.color.white));
            c.this.f45374b.setBackground(this.f45384a.getResources().getDrawable(R.drawable.bg_video_detail_land_feedback_submit_selector));
        }
    }

    /* JADX INFO: renamed from: com.mgs.carparking.widgets.dialog.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VideoDetailLandFeedbackPop.java */
    public class ViewOnClickListenerC0545c implements View.OnClickListener {
        public ViewOnClickListenerC0545c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.f45378f.size() > 0) {
                for (VodFeedbackEntry vodFeedbackEntry : c.this.f45378f) {
                    if (vodFeedbackEntry.isCheck()) {
                        c.this.f45379g = vodFeedbackEntry.getTitle();
                    }
                }
            }
            if (o.b(c.this.f45379g)) {
                p.b("请选择标签");
                return;
            }
            c cVar = c.this;
            cVar.f45380h = cVar.f45373a.getText().toString().trim();
            if (c.this.f45381i != null) {
                c.this.f45381i.a(c.this.f45379g, c.this.f45380h);
            }
        }
    }

    /* JADX INFO: compiled from: VideoDetailLandFeedbackPop.java */
    public interface d {
        void a(String str, String str2);
    }

    public c(Context context, RecommandVideosEntity recommandVideosEntity, String str) {
        super(context);
        this.f45378f = new ArrayList();
        this.f45379g = "";
        this.f45380h = "";
        this.f45382j = recommandVideosEntity;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_land_feedback, (ViewGroup) null);
        this.f45373a = (EditText) viewInflate.findViewById(R.id.et_input);
        this.f45374b = (TextView) viewInflate.findViewById(R.id.tv_feedback_submit);
        this.f45375c = (TextView) viewInflate.findViewById(R.id.tv_title);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f45376d = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(context, 3));
        this.f45375c.setOnClickListener(new a());
        if (!o.b(l0.Y())) {
            for (String str2 : Arrays.asList(l0.Y().split(StringUtils.COMMA))) {
                VodFeedbackEntry vodFeedbackEntry = new VodFeedbackEntry();
                vodFeedbackEntry.setTitle(str2);
                this.f45378f.add(vodFeedbackEntry);
            }
        }
        if (recommandVideosEntity != null) {
            if (recommandVideosEntity.getType_pid() == 1) {
                this.f45373a.setText(recommandVideosEntity.getVod_name() + Z7.f30794r);
            } else {
                this.f45373a.setText(recommandVideosEntity.getVod_name() + Z7.f30794r + str + Z7.f30794r);
            }
            EditText editText = this.f45373a;
            editText.setSelection(editText.length());
        }
        FeedbackTagAdapter feedbackTagAdapter = new FeedbackTagAdapter(context, this.f45378f);
        this.f45377e = feedbackTagAdapter;
        this.f45376d.setAdapter(feedbackTagAdapter);
        this.f45377e.f(new b(context));
        this.f45374b.setOnClickListener(new ViewOnClickListenerC0545c());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.translucent));
        getContentView().setSystemUiVisibility(5894);
        viewInflate.measure(0, 0);
        setSoftInputMode(3);
        update();
    }

    public void j(d dVar) {
        this.f45381i = dVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }
}
