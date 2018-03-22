package sri.materialui


import sri.core._
import sri.universal._

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import sri.web.vdom.DOMProps
import org.scalajs.dom
import scalajsplus.macros.{FunctionObjectMacro, exclude}
import scalajsplus.{OptDefault, OptionalParam, DangerousUnionToJSAnyImplicit}
import sri.web.vdom.ReactEventAliases._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|





 @js.native
 @JSImport("material-ui/BottomNavigation",JSImport.Default)
object MuiBottomNavigationComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiBottomNavigation {
    
    @inline
    def apply(index : OptionalParam[Double | Int] = OptDefault,
id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
showLabels : OptionalParam[Boolean] = OptDefault,
onChange : OptionalParam[(ReactEventH,Int) => _] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiBottomNavigationComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiBottomNavigationComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiBottomNavigationComponent.type](
      MuiBottomNavigationComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiBottomNavigationC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiBottomNavigationComponent.type](
      MuiBottomNavigationComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         


     

         
