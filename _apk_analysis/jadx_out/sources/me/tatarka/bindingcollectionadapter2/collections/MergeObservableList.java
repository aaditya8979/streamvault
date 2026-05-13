package me.tatarka.bindingcollectionadapter2.collections;

import androidx.annotation.NonNull;
import androidx.databinding.ListChangeRegistry;
import androidx.databinding.ObservableList;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class MergeObservableList<T> extends AbstractList<T> implements ObservableList<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<List<? extends T>> f74233b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MergeObservableList<T>.a f74234c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ListChangeRegistry f74235d = new ListChangeRegistry();

    public class a extends ObservableList.OnListChangedCallback {
        public a() {
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onChanged(ObservableList observableList) {
            ((AbstractList) MergeObservableList.this).modCount++;
            MergeObservableList.this.f74235d.notifyChanged(MergeObservableList.this);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeChanged(ObservableList observableList, int i10, int i11) {
            int size = MergeObservableList.this.f74233b.size();
            int size2 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                List list = (List) MergeObservableList.this.f74233b.get(i12);
                if (list == observableList) {
                    MergeObservableList.this.f74235d.notifyChanged(MergeObservableList.this, size2 + i10, i11);
                    return;
                }
                size2 += list.size();
            }
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeInserted(ObservableList observableList, int i10, int i11) {
            ((AbstractList) MergeObservableList.this).modCount++;
            int size = MergeObservableList.this.f74233b.size();
            int size2 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                List list = (List) MergeObservableList.this.f74233b.get(i12);
                if (list == observableList) {
                    MergeObservableList.this.f74235d.notifyInserted(MergeObservableList.this, size2 + i10, i11);
                    return;
                }
                size2 += list.size();
            }
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeMoved(ObservableList observableList, int i10, int i11, int i12) {
            int size = MergeObservableList.this.f74233b.size();
            int size2 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                List list = (List) MergeObservableList.this.f74233b.get(i13);
                if (list == observableList) {
                    MergeObservableList.this.f74235d.notifyMoved(MergeObservableList.this, i10 + size2, size2 + i11, i12);
                    return;
                }
                size2 += list.size();
            }
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeRemoved(ObservableList observableList, int i10, int i11) {
            ((AbstractList) MergeObservableList.this).modCount++;
            int size = MergeObservableList.this.f74233b.size();
            int size2 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                List list = (List) MergeObservableList.this.f74233b.get(i12);
                if (list == observableList) {
                    MergeObservableList.this.f74235d.notifyRemoved(MergeObservableList.this, size2 + i10, i11);
                    return;
                }
                size2 += list.size();
            }
        }
    }

    @Override // androidx.databinding.ObservableList
    public void addOnListChangedCallback(@NonNull ObservableList.OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback) {
        this.f74235d.add(onListChangedCallback);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int size = this.f74233b.size();
        int size2 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            List<? extends T> list = this.f74233b.get(i11);
            int i12 = i10 - size2;
            if (i12 < list.size()) {
                return list.get(i12);
            }
            size2 += list.size();
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // androidx.databinding.ObservableList
    public void removeOnListChangedCallback(@NonNull ObservableList.OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback) {
        this.f74235d.remove(onListChangedCallback);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        int size = this.f74233b.size();
        int size2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            size2 += this.f74233b.get(i10).size();
        }
        return size2;
    }
}
