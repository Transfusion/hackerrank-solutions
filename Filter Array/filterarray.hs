f :: Int -> [Int] -> [Int]
f n arr = foldr (\x -> if ((\a -> a < n) x) then (x:) else id) [] arr
--Fill up this function

-- The Input/Output section. You do not need to change or modify this part
main = do 
    n <- readLn :: IO Int 
    inputdata <- getContents 
    let 
        numbers = map read (lines inputdata) :: [Int] 
    putStrLn . unlines $ (map show . f n) numbers
