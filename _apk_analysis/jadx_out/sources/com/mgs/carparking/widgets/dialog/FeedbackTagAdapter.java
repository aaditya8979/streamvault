package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.VodFeedbackEntry;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class FeedbackTagAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f45205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VodFeedbackEntry> f45206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f45207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f45208l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45209b;

        public a(int i10) {
            this.f45209b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (FeedbackTagAdapter.this.f45208l != null) {
                FeedbackTagAdapter.this.f45208l.a(this.f45209b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public LinearLayout f45211l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f45212m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f45213n;

        public b(@NonNull View view) {
            super(view);
            this.f45211l = (LinearLayout) view.findViewById(R.id.ll_click);
            this.f45212m = (TextView) view.findViewById(R.id.tv_title);
            this.f45213n = (ImageView) view.findViewById(R.id.iv_select);
        }
    }

    public interface c {
        void a(int i10);
    }

    public FeedbackTagAdapter(Context context, List<VodFeedbackEntry> list) {
        this.f45205i = context;
        this.f45206j = list;
        this.f45207k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f45206j.get(i10).isCheck()) {
            bVar.f45213n.setImageResource(R.drawable.ic_mine_history_selector);
        } else {
            bVar.f45213n.setImageResource(R.drawable.ic_mine_history_unselector);
        }
        bVar.f45212m.setText(this.f45206j.get(i10).getTitle());
        bVar.f45211l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f45207k.inflate(R.layout.item_video_land_feedback_tag, viewGroup, false));
    }

    public void f(c cVar) {
        this.f45208l = cVar;
    }

    public void g(List<VodFeedbackEntry> list, int i10) {
        this.f45206j = list;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == i11) {
                list.get(i11).setCheck(true);
            } else {
                list.get(i11).setCheck(false);
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f45206j.size();
    }
}
