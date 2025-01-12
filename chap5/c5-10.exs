# Listing 5.10 プロセス生成とメッセージ送受信を行うプログラム
defmodule Process1 do
  def main do
    # プロセスの起動
    receiver_pid = spawn(fn ->
      receive do  # メッセージを受信したときの処理
        {:ok, message} -> IO.puts("Received messaged: #{message}")
      end
    end)
  # メッセージを送信
  send(receiver_pid, {:ok, "Hello from sender"})
  end
end

Process1.main
