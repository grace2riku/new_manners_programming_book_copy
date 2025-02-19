# Listing 5.12 プロセスの監視
defmodule MonitorExample do
  def start do
    # swawn_monitorを使用して子プロセスを生成し、そのプロセスを監視
    {pid, _ref} = spawn_monitor(fn -> child_process() end)

    # 子プロセスのPIDと監視参照を表示
    IO.puts("Spawned and monitored process: #{inspect(pid)}")

    # 子プロセスの終了通知を待機
    receive do
      {:DOWN, _ref, :process, pid, reason} ->
        IO.puts("#{inspect(pid)} exited with reason #{inspect(reason)}")
      end
  end

  defp child_process do
    # 子プロセスは一定時間待機した後に終了する
    Process.sleep(200)
    IO.puts("Child process is exiting now.")
    exit(:normal)
  end

end

MonitorExample.start
