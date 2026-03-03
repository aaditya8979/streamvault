import { notFound } from "next/navigation";
import DetailClient from "@/components/DetailClient";

type Props = { params: Promise<{ type: string; id: string }> };

export default async function DetailPage({ params }: Props) {
  const { type, id } = await params;
  if (!["movie", "tv"].includes(type)) notFound();
  const numId = parseInt(id);
  if (isNaN(numId)) notFound();
  return <DetailClient type={type as "movie" | "tv"} id={numId} />;
}
