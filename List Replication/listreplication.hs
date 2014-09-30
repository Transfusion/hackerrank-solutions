import Data.List
f n arr = sort $ concat [arr | _ <- [1 .. n]]-- Complete this Function

-- This part handles the Input and Output and can be used as it is. Do not modify this part.
main = do
   n <- readLn :: IO Int
   inputdata <- getContents
   mapM_ putStrLn $ map show $ f n $ map (read :: String -> Int) $ lines inputdata

