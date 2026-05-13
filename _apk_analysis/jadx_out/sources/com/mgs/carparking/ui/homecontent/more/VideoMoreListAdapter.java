package com.mgs.carparking.ui.homecontent.more;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import ec.d;
import ec.e;
import java.util.List;
import oc.a;

/* JADX INFO: loaded from: classes2.dex */
public class VideoMoreListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f44650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<RecommandVideosEntity> f44651j;

    public void c(List<RecommandVideosEntity> list) {
        this.f44651j = list;
    }

    public void d(a aVar) {
        this.f44650i = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (e.a(this.f44651j)) {
            return 0;
        }
        return this.f44651j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return this.f44651j.get(i10) == null ? -1 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i10) {
        if (viewHolder instanceof d) {
            ((d) viewHolder).a(this.f44650i, this.f44651j.get(i10), Integer.valueOf(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        return i10 == -1 ? new VideoMoreAdsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_video_more_ads, viewGroup, false)) : new VideoMoreViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_video_more_list, viewGroup, false));
    }
}
