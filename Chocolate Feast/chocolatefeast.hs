import System.IO (isEOF)
import Data.Char
import Data.List.Split
import GHC.Float

main = myLoop

myLoop = do done <- isEOF
            if done
              then return ()
              else do
                inp <- getLine
                let u = (teststr inp)
                if u /= -1
                    then putStrLn (show u)
                    else return ()

                myLoop

toint :: String -> [Int]
toint t = map read (splitOn " " t) :: [Int]

findchoc :: Int -> Int -> Int
findchoc x y
        | x < y = 0
        | otherwise = (x `div` y) + findchoc(x `div` y + x `rem` y) (y)

teststr :: String -> Int
teststr s
        | length (splitOn " " s) == 1 = -1
--        | (toint s !! 0 `div` toint s !! 1 ) < (toint s !! 2) = (toint s !! 0 `div` toint s !! 1 )
        | otherwise = findchoc (toint s !! 0 `div` toint s !! 1 ) (toint s !! 2) + (toint s !! 0 `div` toint s !! 1 )
