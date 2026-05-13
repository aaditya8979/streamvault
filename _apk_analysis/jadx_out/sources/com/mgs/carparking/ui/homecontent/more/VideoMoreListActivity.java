package com.mgs.carparking.ui.homecontent.more;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.dramarush.shortin.R;
import com.mgs.carparking.basecommon.ui.BarActivity;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.safedk.android.utils.Logger;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import java.util.List;
import oe.f;
import qe.e;
import qe.g;
import zp.n;

/* JADX INFO: loaded from: classes2.dex */
public class VideoMoreListActivity extends BarActivity implements oc.b {
    public RelativeLayout A;
    public String B;
    public int C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public oc.c f44642v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public VideoMoreListAdapter f44643w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SmartRefreshLayout f44644x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f44645y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RelativeLayout f44646z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoMoreListActivity.this.finish();
        }
    }

    public class b implements g {
        public b() {
        }

        @Override // qe.g
        public void d(@NonNull f fVar) {
            VideoMoreListActivity.this.f44642v.g(true, VideoMoreListActivity.this.C);
        }
    }

    public class c implements e {
        public c() {
        }

        @Override // qe.e
        public void a(@NonNull f fVar) {
            VideoMoreListActivity.this.f44642v.g(false, VideoMoreListActivity.this.C);
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        context.startActivity(intent);
    }

    @Override // oc.b
    public void isLoading(boolean z10) {
        this.f44644x.s();
        this.f44644x.n();
        this.A.setVisibility(z10 ? 0 : 8);
    }

    public void loadEmpty(boolean z10) {
        this.f44645y.setVisibility(z10 ? 0 : 8);
    }

    @Override // oc.b
    public void loadNoNet(boolean z10) {
        this.f44646z.setVisibility(z10 ? 0 : 8);
    }

    public final void n() {
    }

    public final void o() {
        this.f44644x.H(true);
        ClassicsHeader classicsHeader = new ClassicsHeader(this);
        this.f44644x.I(true);
        classicsHeader.u(12.0f);
        new ClassicsFooter(this).u(12.0f);
        this.f44644x.L(new b());
        this.f44644x.K(new c());
    }

    @Override // oc.b
    public void onClick(RecommandVideosEntity recommandVideosEntity) {
        if (recommandVideosEntity != null) {
            Intent intent = new Intent(this, (Class<?>) VideoPlayDetailActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("id", recommandVideosEntity.getId());
            intent.putExtras(bundle);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
        }
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_video_more_list, false);
        n.a(this);
        this.f44642v = new oc.c(this);
        p();
        this.f44642v.g(true, this.C);
        n();
    }

    public final void p() {
        ((LinearLayout) findViewById(R.id.layout_actionbar_back)).setOnClickListener(new a());
        this.f44644x = (SmartRefreshLayout) findViewById(R.id.refresh_layout);
        this.f44645y = (TextView) findViewById(R.id.tv_loadEmpty);
        this.f44646z = (RelativeLayout) findViewById(R.id.rl_loadNoNet);
        this.A = (RelativeLayout) findViewById(R.id.rl_isLoading);
        o();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        if (this.f44643w == null) {
            VideoMoreListAdapter videoMoreListAdapter = new VideoMoreListAdapter();
            this.f44643w = videoMoreListAdapter;
            videoMoreListAdapter.d(this.f44642v);
        }
        recyclerView.setAdapter(this.f44643w);
        this.B = getIntent().getStringExtra("videoTitle");
        this.C = getIntent().getIntExtra("videoModuleId", 0);
        ((TextView) findViewById(R.id.tv_actionbar_title_middle)).setText(this.B);
        Glide.with((FragmentActivity) this).load(Integer.valueOf(R.drawable.ic_is_loading)).into((ImageView) findViewById(R.id.img_loading));
    }

    @Override // oc.b
    public void resetNoMoreData() {
        this.f44644x.s();
        this.f44644x.n();
        this.f44644x.F();
    }

    @Override // oc.b
    public void showData(List<RecommandVideosEntity> list) {
        loadEmpty(ec.e.a(list));
        VideoMoreListAdapter videoMoreListAdapter = this.f44643w;
        if (videoMoreListAdapter != null) {
            videoMoreListAdapter.d(this.f44642v);
            this.f44643w.c(list);
            this.f44643w.notifyDataSetChanged();
        }
    }
}
