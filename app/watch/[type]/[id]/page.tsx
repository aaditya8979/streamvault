import { notFound } from "next/navigation";
import WatchClient from "@/components/WatchClient";

type Props = {
  params: Promise<{ type: string; id: string }>;
  searchParams: Promise<{ s?: string; e?: string }>;
};

export default async function WatchPage({ params, searchParams }: Props) {
  const { type, id } = await params;
  const { s, e } = await searchParams;
  if (!["movie", "tv"].includes(type)) notFound();
  const numId = parseInt(id);
  if (isNaN(numId)) notFound();
  return (
    <WatchClient
      type={type as "movie" | "tv"}
      id={numId}
      season={parseInt(s ?? "1") || 1}
      episode={parseInt(e ?? "1") || 1}
    />
  );
}
