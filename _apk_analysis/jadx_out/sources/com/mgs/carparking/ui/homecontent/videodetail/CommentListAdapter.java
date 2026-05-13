package com.mgs.carparking.ui.homecontent.videodetail;

import android.content.Context;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import hc.y0;
import ic.v;
import java.util.List;
import me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter;
import sd.i;
import zp.j;
import zp.r;

/* JADX INFO: loaded from: classes11.dex */
public class CommentListAdapter extends BindingRecyclerViewAdapter {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f44699r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i f44700s;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y0 f44701b;

        /* JADX INFO: renamed from: com.mgs.carparking.ui.homecontent.videodetail.CommentListAdapter$a$a, reason: collision with other inner class name */
        public class C0539a implements i.b {
            public C0539a() {
            }

            @Override // sd.i.b
            public void a(y0 y0Var, int i10) {
                CommentListAdapter.this.f44700s.dismiss();
                op.a.a().b(new v(y0Var, i10));
            }
        }

        public a(y0 y0Var) {
            this.f44701b = y0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentListAdapter.this.f44700s = new i(CommentListAdapter.this.f44699r, this.f44701b);
            CommentListAdapter.this.f44700s.showAsDropDown(view, j.a(-35.0f, r.b()), 0);
            CommentListAdapter.this.f44700s.a(new C0539a());
        }
    }

    public CommentListAdapter(Context context) {
        this.f44699r = context;
    }

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter
    public void f(ViewDataBinding viewDataBinding, int i10, int i11, int i12, Object obj) {
        super.f(viewDataBinding, i10, i11, i12, obj);
        viewDataBinding.getRoot().findViewById(R.id.rl_filter).setOnClickListener(new a((y0) obj));
    }

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10, List list) {
        super.onBindViewHolder(viewHolder, i10, list);
    }
}
