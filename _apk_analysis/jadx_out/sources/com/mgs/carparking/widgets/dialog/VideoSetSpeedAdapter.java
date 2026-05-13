package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.VideoSetSpeedEntry;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class VideoSetSpeedAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f45328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f45329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f45330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<VideoSetSpeedEntry> f45331l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45332b;

        public a(int i10) {
            this.f45332b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VideoSetSpeedAdapter.this.f45329j != null) {
                VideoSetSpeedAdapter.this.f45329j.a(this.f45332b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f45334l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f45335m;

        public b(@NonNull View view) {
            super(view);
            this.f45334l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f45335m = (TextView) view.findViewById(R.id.tv_name);
        }
    }

    public interface c {
        void a(int i10);
    }

    public VideoSetSpeedAdapter(Context context, List<VideoSetSpeedEntry> list) {
        this.f45328i = context;
        this.f45331l = list;
        this.f45330k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        bVar.f45335m.setText(this.f45331l.get(i10).getName());
        if (this.f45331l.get(i10).isSelector()) {
            bVar.f45335m.setTextColor(this.f45328i.getResources().getColor(R.color.color_42BD56));
        } else {
            bVar.f45335m.setTextColor(this.f45328i.getResources().getColor(R.color.white));
        }
        bVar.f45334l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f45330k.inflate(R.layout.item_pop_set_speed, viewGroup, false));
    }

    public void f(c cVar) {
        this.f45329j = cVar;
    }

    public void g(List<VideoSetSpeedEntry> list, int i10) {
        this.f45331l = list;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == i11) {
                list.get(i11).setSelector(true);
            } else {
                list.get(i11).setSelector(false);
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f45331l.size();
    }
}
