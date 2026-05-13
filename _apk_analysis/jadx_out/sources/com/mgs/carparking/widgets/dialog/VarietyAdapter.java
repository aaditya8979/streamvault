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
import com.bumptech.glide.Glide;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.VideoBean;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class VarietyAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f45282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoBean> f45283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f45284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f45285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f45286m;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45287b;

        public a(int i10) {
            this.f45287b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VarietyAdapter.this.f45286m != null) {
                VarietyAdapter.this.f45286m.a(this.f45287b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public LinearLayout f45289l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f45290m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f45291n;

        public b(@NonNull View view) {
            super(view);
            this.f45289l = (LinearLayout) view.findViewById(R.id.ll_click);
            this.f45290m = (TextView) view.findViewById(R.id.tv_name);
            this.f45291n = (ImageView) view.findViewById(R.id.iv_is_play);
        }
    }

    public interface c {
        void a(int i10);
    }

    public VarietyAdapter(Context context, List<VideoBean> list, String str) {
        this.f45282i = context;
        this.f45283j = list;
        this.f45285l = str;
        this.f45284k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f45283j.get(i10).isCheck()) {
            bVar.f45290m.setBackground(this.f45282i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num_selector));
            bVar.f45290m.setTextColor(this.f45282i.getResources().getColor(R.color.color_commen));
            bVar.f45291n.setVisibility(0);
            Glide.with(this.f45282i).load(Integer.valueOf(R.drawable.ic_video_is_play)).into(bVar.f45291n);
        } else {
            bVar.f45290m.setBackground(this.f45282i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num));
            bVar.f45290m.setTextColor(this.f45282i.getResources().getColor(R.color.color_999999));
            bVar.f45291n.setVisibility(8);
        }
        bVar.f45290m.setText(this.f45283j.get(i10).getTitle());
        bVar.f45289l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f45284k.inflate(R.layout.item_pop_variety, viewGroup, false));
    }

    public void f(c cVar) {
        this.f45286m = cVar;
    }

    public void g(List<VideoBean> list, int i10) {
        this.f45283j = list;
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
        return this.f45283j.size();
    }
}
