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

/* JADX INFO: loaded from: classes9.dex */
public class FeedbackTagVertalAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f45215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VodFeedbackEntry> f45216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f45217k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f45218l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45219b;

        public a(int i10) {
            this.f45219b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (FeedbackTagVertalAdapter.this.f45218l != null) {
                FeedbackTagVertalAdapter.this.f45218l.a(this.f45219b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public LinearLayout f45221l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f45222m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f45223n;

        public b(@NonNull View view) {
            super(view);
            this.f45221l = (LinearLayout) view.findViewById(R.id.ll_click);
            this.f45222m = (TextView) view.findViewById(R.id.tv_title);
            this.f45223n = (ImageView) view.findViewById(R.id.iv_select);
        }
    }

    public interface c {
        void a(int i10);
    }

    public FeedbackTagVertalAdapter(Context context, List<VodFeedbackEntry> list) {
        this.f45215i = context;
        this.f45216j = list;
        this.f45217k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f45216j.get(i10).isCheck()) {
            bVar.f45223n.setImageResource(R.drawable.ic_mine_history_selector);
        } else {
            bVar.f45223n.setImageResource(R.drawable.ic_mine_history_unselector);
        }
        bVar.f45222m.setText(this.f45216j.get(i10).getTitle());
        bVar.f45221l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f45217k.inflate(R.layout.item_video_vertal_feedback_tag, viewGroup, false));
    }

    public void f(c cVar) {
        this.f45218l = cVar;
    }

    public void g(List<VodFeedbackEntry> list, int i10) {
        this.f45216j = list;
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
        return this.f45216j.size();
    }
}
