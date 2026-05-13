package ws;

/* JADX INFO: compiled from: ArrayAdapterInterface.java */
/* JADX INFO: loaded from: classes11.dex */
public interface a<T> {
    int getArrayLength(T t10);

    int getElementSizeInBytes();

    String getTag();

    T newArray(int i10);
}
