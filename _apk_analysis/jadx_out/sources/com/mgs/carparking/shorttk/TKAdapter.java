package com.mgs.carparking.shorttk;

import a6.m;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;
import com.dramarush.shortin.R;
import com.mgs.carparking.db.VideoCollectionDao;
import com.mgs.carparking.netbean.TKBean;
import com.safedk.android.utils.Logger;
import com.yk.e.pl.PreloadManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class TKAdapter extends PagerAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<TKBean> f44407c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f44409e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<View> f44406b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f44408d = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TKAdapter.this.f44409e.e();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TKBean f44411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f44412c;

        public b(TKBean tKBean, j jVar) {
            this.f44411b = tKBean;
            this.f44412c = jVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f44411b.getNetCineVarIsLike()) {
                this.f44412c.f44432h.setImageResource(R.drawable.ic_collection_un);
                m.c("xxxxaxxxxxxxxx", "---------- falseaaaaaaaaaaaaaaaaaaaaaaaa");
            } else {
                m.c("xxxxaxxxxxxxxx", "---------- trueaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                this.f44412c.f44432h.setImageResource(R.drawable.ic_collection);
            }
            i iVar = TKAdapter.this.f44409e;
            TKBean tKBean = this.f44411b;
            iVar.f(tKBean, tKBean.getNetCineVarIsLike());
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TKBean f44414b;

        public c(TKBean tKBean) {
            this.f44414b = tKBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TKAdapter.this.f44409e.b(this.f44414b);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = TKAdapter.this.f44409e;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TKBean f44417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f44418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f44419d;

        public e(TKBean tKBean, Context context, int i10) {
            this.f44417b = tKBean;
            this.f44418c = context;
            this.f44419d = i10;
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
            if (!this.f44417b.getNetCineVarIsShow()) {
                Intent intent = new Intent(this.f44418c, (Class<?>) ShortTkActivity.class);
                intent.putExtra("netcineVarVideoBean", this.f44417b);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f44418c, intent);
            } else {
                i iVar = TKAdapter.this.f44409e;
                if (iVar != null) {
                    iVar.d(this.f44419d);
                }
            }
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f44421b;

        public f(int i10) {
            this.f44421b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = TKAdapter.this.f44409e;
            if (iVar != null) {
                iVar.d(this.f44421b);
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = TKAdapter.this.f44409e;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = TKAdapter.this.f44409e;
            if (iVar != null) {
                iVar.a();
            }
        }
    }

    public interface i {
        void a();

        void b(TKBean tKBean);

        void c();

        void d(int i10);

        void e();

        void f(TKBean tKBean, boolean z10);
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ExpandableTextView f44426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f44427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f44428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ImageView f44429e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ImageView f44430f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ImageView f44431g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ImageView f44432h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ImageView f44433i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public TKView f44434j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public FrameLayout f44435k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ConstraintLayout f44436l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f44437m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public TextView f44438n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public LinearLayout f44439o;

        public j(View view) {
            TKView tKView = (TKView) view.findViewById(R.id.tiktok_View);
            this.f44434j = tKView;
            this.f44429e = (ImageView) tKView.findViewById(R.id.iv_thumb);
            this.f44432h = (ImageView) this.f44434j.findViewById(R.id.iv_collection);
            this.f44439o = (LinearLayout) this.f44434j.findViewById(R.id.mivX);
            this.f44436l = (ConstraintLayout) this.f44434j.findViewById(R.id.clView);
            this.f44437m = (TextView) this.f44434j.findViewById(R.id.tv_title);
            this.f44427c = (TextView) this.f44434j.findViewById(R.id.bt_skip);
            this.f44428d = (TextView) this.f44434j.findViewById(R.id.tv_vod_name);
            this.f44435k = (FrameLayout) view.findViewById(R.id.container);
            this.f44426b = (ExpandableTextView) view.findViewById(R.id.tv_vod_des);
            this.f44431g = (ImageView) view.findViewById(R.id.iv_x);
            this.f44430f = (ImageView) view.findViewById(R.id.iv_speed);
            this.f44438n = (TextView) view.findViewById(R.id.tv_speed);
            this.f44433i = (ImageView) view.findViewById(R.id.iv_Share);
            view.setTag(this);
        }
    }

    public TKAdapter(List<TKBean> list) {
        this.f44407c = list;
    }

    public void a(i iVar) {
        this.f44409e = iVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i10, @NonNull Object obj) {
        View view = (View) obj;
        viewGroup.removeView(view);
        TKBean tKBean = this.f44407c.get(i10);
        PreloadManager.getInstance(viewGroup.getContext()).removePreloadTask(tKBean.getVod_url((i10 + 1) + ".mp4"));
        this.f44406b.add(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List<TKBean> list = this.f44407c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    @SuppressLint({"SetTextI18n"})
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i10) {
        View viewInflate;
        j jVar;
        Context context = viewGroup.getContext();
        if (this.f44406b.size() > 0) {
            viewInflate = this.f44406b.get(0);
            this.f44406b.remove(0);
        } else {
            viewInflate = null;
        }
        if (viewInflate == null) {
            viewInflate = LayoutInflater.from(context).inflate(R.layout.item_tik_tok, viewGroup, false);
            jVar = new j(viewInflate);
        } else {
            jVar = (j) viewInflate.getTag();
        }
        TKBean tKBean = this.f44407c.get(i10);
        PreloadManager preloadManager = PreloadManager.getInstance(context);
        StringBuilder sb2 = new StringBuilder();
        int i11 = i10 + 1;
        sb2.append(i11);
        sb2.append(".mp4");
        preloadManager.addPreloadTask(tKBean.getVod_url(sb2.toString()), i10, null);
        ud.c.d(context, tKBean.getNetCineVarListVod_pic(), jVar.f44429e, false);
        jVar.f44428d.setText(tKBean.netCineVarListVod_name);
        jVar.f44437m.setText("Episode " + i11);
        jVar.f44426b.setContent("Episode " + i11 + " | " + tKBean.getNetCineVarListVod_blurb());
        jVar.f44427c.setText("Watch the full series · " + tKBean.getNetCineVarListVod_serial() + " episodes");
        if (VideoCollectionDao.getInstance().isExist(tKBean.getNetCineVarListVod_id())) {
            jVar.f44432h.setImageResource(R.drawable.ic_collection);
            tKBean.setNetCineVarIsLike(true);
            m.c("xxxxaxxxxxxxxx", "---------- true");
        } else {
            jVar.f44432h.setImageResource(R.drawable.ic_collection_un);
            tKBean.setNetCineVarIsLike(false);
            m.c("xxxxaxxxxxxxxx", "---------- false");
        }
        if (tKBean.getNetCineVarIsShow()) {
            jVar.f44436l.setVisibility(0);
            jVar.f44439o.setVisibility(0);
        } else {
            jVar.f44436l.setVisibility(8);
            jVar.f44439o.setVisibility(8);
        }
        jVar.f44436l.setOnClickListener(new a());
        jVar.f44432h.setOnClickListener(new b(tKBean, jVar));
        jVar.f44428d.setOnClickListener(new c(tKBean));
        jVar.f44438n.setOnClickListener(new d());
        jVar.f44427c.setOnClickListener(new e(tKBean, context, i10));
        jVar.f44431g.setOnClickListener(new f(i10));
        jVar.f44430f.setOnClickListener(new g());
        jVar.f44433i.setOnClickListener(new h());
        jVar.f44425a = i10;
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }
}
