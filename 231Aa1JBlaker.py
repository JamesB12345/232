
x = float(input("please enter dollars only. The next prompt after this will be for cents"))



y = float(input("cents"))


def dollar_change(dollar):

  print("Change O Matic")

  dollar20 = dollar // 20

  dollar10 = dollar % 20 // 10

  dollar5 = dollar % 20 % 10 // 5

  print("the amount of dollars you input is", (x), "dollars")

  if dollar20 >= 2:
      print(dollar20, "$20s")
  if dollar20 == 1:
      print(dollar20, "$20")
  if dollar10 >= 2:
      print(dollar10, "$10s")
  if dollar10 == 1:
      print(dollar10, "$10")
  if dollar5 >= 2:
      print(dollar5, "$5s")
  if dollar5 == 1:
      print(dollar5, "$5")





def coin_change(cents):

  quarter = (cents // 25)

  dime = (cents % 25 // 10)

  nickel = (cents % 25 % 10 // 5)

  penny = (cents % 5)

  print("cents", cents)

  if quarter >= 2:
      print(quarter, "quarters")
  if quarter == 1:
      print(quarter, "quarter")
  if dime >= 2:
      print(dime, "dimes")
  if dime == 1:
      print(dime, "dime")
  if nickel >= 2:
      print(nickel, "nickles")
  if nickel == 1:
      print(nickel, "nickel")
  if penny >= 2:
      print(penny, "pennies")
      if penny == 1:
          print(penny, "penny")






while x > 200:
  x = int(input("reinput"))

if x <= 200 and y <= 999:
      print (format(x, '.2f'))
      print (format(y, '.2f'))

      print(dollar_change(x))
      print(coin_change(y))


      for i in range(600000):

          while x > 200:
              x = int(input("reinput"))

          if x <= 200 and y <= 999:

              x = int(input("please input another number."))
              print(format(x, '.2f'))
              print(dollar_change(x))
              print(coin_change(y))
