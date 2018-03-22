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
 @JSImport("material-ui/AppBar",JSImport.Default)
object MuiAppBarComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiAppBar {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
color : OptionalParam[MuiAppBarColor] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
position : OptionalParam[MuiAppBarPosition] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiAppBarComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiAppBarComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiAppBarComponent.type](
      MuiAppBarComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiAppBarC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiAppBarComponent.type](
      MuiAppBarComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         
 @js.native
 trait MuiAppBarColor extends js.Object

 object MuiAppBarColor{
   @inline def INHERIT = "inherit".asInstanceOf[MuiAppBarColor] 
@inline def PRIMARY = "primary".asInstanceOf[MuiAppBarColor] 
@inline def ACCENT = "accent".asInstanceOf[MuiAppBarColor] 
@inline def DEFAULT = "default".asInstanceOf[MuiAppBarColor] 
          }


 @js.native
 trait MuiAppBarPosition extends js.Object

 object MuiAppBarPosition{
   @inline def STATIC = "static".asInstanceOf[MuiAppBarPosition] 
@inline def FIXED = "fixed".asInstanceOf[MuiAppBarPosition] 
@inline def ABSOLUTE = "absolute".asInstanceOf[MuiAppBarPosition] 
          }



     

         
