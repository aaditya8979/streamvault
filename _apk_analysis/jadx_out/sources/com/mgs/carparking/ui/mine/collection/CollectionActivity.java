package com.mgs.carparking.ui.mine.collection;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.basecommon.ui.BarActivity;
import com.mgs.carparking.netbean.VideoCollectionBeanEntry;
import com.mgs.carparking.shorttk.ShortTkActivity;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.safedk.android.utils.Logger;
import java.util.List;
import zp.n;
import zp.o;

/* JADX INFO: loaded from: classes3.dex */
public class CollectionActivity extends BarActivity implements wc.b {
    public TextView A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public wc.a f44849v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CollectionListAdapter f44850w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RecyclerView f44851x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ImageView f44852y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ConstraintLayout f44853z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CollectionActivity.this.f44849v != null) {
                CollectionActivity.this.f44849v.c();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CollectionActivity.this.f44849v != null) {
                CollectionActivity.this.f44849v.delete();
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CollectionActivity.this.f44849v != null) {
                CollectionActivity.this.f44849v.a();
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionActivity.this.finish();
        }
    }

    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity componentActivity, Intent intent, int i10) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (intent == null) {
            return;
        }
        componentActivity.startActivityForResult(intent, i10);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        context.startActivity(intent);
    }

    @Override // wc.b
    public void delete() {
        wc.a aVar = this.f44849v;
        if (aVar != null) {
            aVar.a();
        }
        refresh(-1);
    }

    public final void m() {
        this.A = (TextView) findViewById(R.id.tv_add);
        this.f44853z = (ConstraintLayout) findViewById(R.id.cl_bottom);
        this.A.setOnClickListener(new a());
        ((TextView) findViewById(R.id.tv_delete)).setOnClickListener(new b());
        ImageView imageView = (ImageView) findViewById(R.id.collectionRightImage);
        this.f44852y = imageView;
        imageView.setOnClickListener(new c());
        ((ImageView) findViewById(R.id.collectionLeftImage)).setOnClickListener(new d());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        this.f44851x = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        if (this.f44850w == null) {
            this.f44850w = new CollectionListAdapter();
        }
        this.f44851x.setItemAnimator(null);
        this.f44851x.setAdapter(this.f44850w);
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_collection, false);
        n.a(this);
        m();
        if (this.f44849v == null) {
            this.f44849v = new wc.c(this);
        }
        this.f44849v.d();
    }

    @Override // wc.b
    public void refresh(int i10) {
        CollectionListAdapter collectionListAdapter = this.f44850w;
        if (collectionListAdapter != null) {
            if (i10 == -1) {
                collectionListAdapter.notifyDataSetChanged();
            } else {
                collectionListAdapter.notifyItemChanged(i10);
            }
        }
    }

    @Override // wc.b
    public void setEdits(int i10) {
        this.f44853z.setVisibility(this.f44849v.b() ? 0 : 8);
        this.f44852y.setImageDrawable(ContextCompat.getDrawable(getApplication(), i10));
        refresh(-1);
    }

    @Override // wc.b
    public void showData(List<VideoCollectionBeanEntry> list) {
        CollectionListAdapter collectionListAdapter = this.f44850w;
        if (collectionListAdapter != null) {
            collectionListAdapter.d(this.f44849v);
            this.f44850w.c(list);
            refresh(-1);
        }
    }

    public void showToast(String str) {
    }

    @Override // wc.b
    public void video(String str, int i10) {
        if (i10 == 34) {
            Intent intent = new Intent(this, (Class<?>) ShortTkActivity.class);
            intent.putExtra("netcineVarVideoId", str);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            return;
        }
        if (o.c(str)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("id", Integer.parseInt(str));
        Intent intent2 = new Intent(this, (Class<?>) VideoPlayDetailActivity.class);
        intent2.putExtras(bundle);
        safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(this, intent2, 1);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    @Override // wc.b
    public void whole(String str) {
        if (o.c(str)) {
            return;
        }
        this.A.setText(str);
    }
}
