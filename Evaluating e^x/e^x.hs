e :: Double -> [Double]
e x = [x**y/product[1..y] | y <- [0..]]
solve :: Double -> Double
solve x = sum $ take 10 (e x)

main :: IO ()
main = getContents >>= mapM_ print. map solve. map (read::String->Double). tail. words

